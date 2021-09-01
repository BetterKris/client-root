package com.client.user.controller;

import com.client.user.entity.User;
import com.client.email.service.EmailService;
import com.client.user.service.UserService;
import com.github.pagehelper.PageHelper;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    private final UserService userService;
    private final EmailService emailService;

    @Autowired
    public UserController(UserService userService, EmailService emailService) {
        this.userService = userService;
        this.emailService = emailService;
    }

    @Value("${configStringA}")
    private String configStringA;

    @GetMapping("/list")
    public List<User> list(User user){
        PageHelper.startPage(user.getPageNum() , user.getPageSize());
        List<User> users = userService.list(user);
        List<User> resultList = new ArrayList<>();
        users.forEach(user1 -> {
            String email = emailService.getEmailById(user1.getId());
            user1.setEmail(email);
            resultList.add(user1);
        });
        return resultList;
    }

    @GetMapping("/getById/{id}")
    @HystrixCommand(fallbackMethod = "getHystrixHandle")
    public User getById(@PathVariable("id") Integer id){
        User user = userService.getById(id);
        if (user != null){
            String email = emailService.getEmailById(id);
            user.setEmail(email);
        }
        return user;
    }

    @PostMapping("/add")
    public Integer add(User user){
        user.setCreatedAt(new Date());
        user.setUpdatedAt(new Date());
        return userService.add(user);
    }

    @PutMapping("/edit/{id}")
    public Integer edit(User user){
        user.setUpdatedAt(new Date());
        return userService.update(user);
    }

    @DeleteMapping("/delete/{id}")
    public Integer delete(@PathVariable("id") Integer id){
        return userService.delete(id);
    }

    public User getHystrixHandle(@PathVariable("id") Integer id){
        User user = new User();
        user.setId(id);
        user.setName("It's the HystrixHandle");
        return user;
    }

    /**
     * 获取配置中心中的配置
     */
    @GetMapping("/getConfigInfo")
    public String getConfigInfo(){
        return configStringA;
    }


}
