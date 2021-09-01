package com.client.user.controller;

import com.client.email.service.EmailService;
import com.client.user.entity.User;
import com.client.user.service.UserService;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class UserControllerTest {

    @Mock
    private UserService mockUserService;
    @Mock
    private EmailService mockEmailService;

    @InjectMocks
    private UserController userControllerTest;

    @Test
    void testList() {
        //对UserController的方法进行封装、配置
        Date date = new Date();
        List<User> userList = List.of(new User(1 , "mock" , 20 , date , date , "" , "" , "" , "" , "" , "" , "" , "" , "" , "1@rest.local" , 0 , 10 , "" ));
        when(mockUserService.list(new User(1))).thenReturn(userList);
        when(mockEmailService.getEmailById(1)).thenReturn("1@rest.local");
        //入参
        User user = new User(1);
        //期待的结果
        List<User> expectedResult = List.of(new User(1 , "mock" , 20 , date , date , "" , "" , "" , "" , "" , "" , "" , "" , "" , "1@rest.local" , 0 , 10 , "" ));
        //断言，验证
        Assert.assertEquals(expectedResult , userControllerTest.list(user));
    }

    @Test
    void testGetById() {
        //对UserController的方法进行封装、配置
        Date date = new Date();
        when(mockUserService.getById(1)).thenReturn(new User(1 , "mock" , 20 , date , date , "" , "" , "" , "" , "" , "" , "" , "" , "" , "1@rest.local" , 0 , 0 , "" ));
        when(mockEmailService.getEmailById(1)).thenReturn("1@rest.local");
        //期待的结果
        User expectedResult = new User(1 , "mock" , 20 , date , date , "" , "" , "" , "" , "" , "" , "" , "" , "" , "1@rest.local" , 0 , 0 , "" );
        //断言，验证
        Assert.assertEquals(expectedResult , userControllerTest.getById(1));
    }

    @Test
    void testGetHystrixHandle() {
        Integer id = 1;
        User expectedResult = new User();
        expectedResult.setId(id);
        expectedResult.setName("It's the HystrixHandle");
        User result = userControllerTest.getHystrixHandle(id);
        assertEquals(expectedResult, result);
    }

    @Test
    void testAdd() {
        Date date = new Date();
        User user = new User(10, "name", 0, date, date, "attribute1", "attribute2", "attribute3", "attribute4", "attribute5", "createdAtStart", "createdAtEnd", "updatedAtStart", "updatedAtEnd", "email", 0, 0, "ifPaging");
        when(mockUserService.add(new User(10, "name", 0, date, date, "attribute1", "attribute2", "attribute3", "attribute4", "attribute5", "createdAtStart", "createdAtEnd", "updatedAtStart", "updatedAtEnd", "email", 0, 0, "ifPaging"))).thenReturn(1);
        Integer result = userControllerTest.add(user);
        assertEquals(1, result);
    }

    @Test
    void testEdit() {
        when(mockUserService.update(new User(1, "name", 0, new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime(), new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime(), "attribute1", "attribute2", "attribute3", "attribute4", "attribute5", "createdAtStart", "createdAtEnd", "updatedAtStart", "updatedAtEnd", "email", 0, 0, "ifPaging"))).thenReturn(1);
        User user = new User(1, "name", 0, new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime(), new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime(), "attribute1", "attribute2", "attribute3", "attribute4", "attribute5", "createdAtStart", "createdAtEnd", "updatedAtStart", "updatedAtEnd", "email", 0, 0, "ifPaging");
        Integer result = userControllerTest.edit(user);
        assertEquals(1, result);
    }

    @Test
    void testDelete() {
        when(mockUserService.delete(1)).thenReturn(1);
        assertEquals(1, userControllerTest.delete(1));
    }

    @Test
    void testGetConfigInfo() {
        String result = userControllerTest.getConfigInfo();
        assertEquals(null, result);
    }
}
