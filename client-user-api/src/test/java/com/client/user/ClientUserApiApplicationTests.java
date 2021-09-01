package com.client.user;

import com.client.user.entity.User;
import com.client.user.mapper.UserMapper;
import com.client.user.service.UserService;
import com.client.user.service.impl.UserServiceImpl;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.Assert.assertNotNull;
import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.any;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
@SpringBootTest
//@RunWith(MockitoJUnitRunner.class)
class ClientUserApiApplicationTests {

//    @Autowired
//    private UserService userService;

//    @InjectMocks
//    @Autowired
//    private UserServiceImpl userService;
//
//    @Mock
//    private UserMapper userMapper;


    @Test
    void contextLoads() {
    }

//    @Test
//    public void list(){
//        User user = new User();
//        user.setAge(10);
//        user.setPageNum(0);
//        user.setPageSize(10);
//        List<User> list = userService.list(user);
//        Mockito.when(userMapper.list(user)).thenReturn(list);
//        System.out.println(list);
//    }
//
//    @Test
//    public void getById(){
//        User user = userService.getById(1);
//        Mockito.when(userMapper.getById(1)).thenReturn(user);
//        System.out.println(user);
//    }
//
//    @Test
//    @Transactional
//    public void add(){
//        User user = new User();
//        user.setName("好晚了");
//        assertNotNull(userMapper.add(user));
//    }

//    @Test
//    @Order(1)
//    void getById2() {
//        User user = userService.getById(1);
////        assertNotNull(user);
//        System.out.println(user);
//    }
//
//    @ParameterizedTest
////    @NullSource
//    @ValueSource(ints = {1 , 2 , 4})
//    @Order(2)
//    void getById3(Integer id) {
//        User user = userService.getById(id);
//        assertNotNull(user);
////        System.out.println(user);
//    }
//
//    @RepeatedTest(4)
//    @Order(3)
//    void getById4() {
//        User user = userService.getById(1);
//        assertNotNull(user);
////        System.out.println(user);
//    }
//
//    @ParameterizedTest
//    @ValueSource(ints = {1 , 2 , 4})
//    void getById5(Integer id) {
//        User userMock = new User();
//        userMock.setId(id);
//        User user1 = userMapper.getById(id);
//        System.out.println(user1);
//        when(userMapper.getById(any())).thenReturn(userMock);
//        User user = userService.getById(id);
//        System.out.println(user);
//        assertNotNull(user);
//    }
//
//    @Test
//    public void createMockObject() {
//        // 使用 mock 静态方法创建 Mock 对象.
//        List mockedList = Mockito.mock(List.class);
//        Assertions.assertTrue(mockedList instanceof List);
//
//        // mock 方法不仅可以 Mock 接口类, 还可以 Mock 具体的类型.
//        ArrayList mockedArrayList = Mockito.mock(ArrayList.class);
//        Assertions.assertTrue(mockedArrayList instanceof List);
//        Assertions.assertTrue(mockedArrayList instanceof ArrayList);
//    }


}
