package com.client.email.controller;

import com.client.email.service.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/email")
public class EmailController {

    @Autowired
    private EmailService emailService;

    @RequestMapping("/getEmailById/{id}")
    public String getEmailById(@PathVariable Integer id){
        return emailService.getEmailById(id);
    }

}
