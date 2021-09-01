package com.client.user.service.impl;

import com.client.user.entity.User;
import com.client.user.mapper.UserMapper;
import com.github.pagehelper.PageInfo;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class UserServiceImplTest {

    @Mock
    private UserMapper mockUserMapper;

    @InjectMocks
    private UserServiceImpl userServiceImplUnderTest;

    @Test
    void testList() {
        //对UserController的方法进行封装、配置
        Date date = new Date();
        List<User> userList = List.of(new User(1 , "mock" , 20 , date , date , "" , "" , "" , "" , "" , "" , "" , "" , "" , "1@rest.local" , 0 , 10 , "" ));
        when(mockUserMapper.list(new User(1))).thenReturn(userList);
        //入参
        User user = new User(1);
        //期待的结果
        List<User> expectedResult = List.of(new User(1 , "mock" , 20 , date , date , "" , "" , "" , "" , "" , "" , "" , "" , "" , "1@rest.local" , 0 , 10 , "" ));
        //断言，验证
        Assert.assertEquals(expectedResult , userServiceImplUnderTest.list(user));
    }

    @Test
    void testList_UserMapperReturnsNoItems() {
        User user = new User(0, "name", 0, new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime(), new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime(), "attribute1", "attribute2", "attribute3", "attribute4", "attribute5", "createdAtStart", "createdAtEnd", "updatedAtStart", "updatedAtEnd", "email", 0, 0, "ifPaging");
        List<User> expectedResult = Collections.emptyList();
        when(mockUserMapper.list(new User(0, "name", 0, new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime(), new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime(), "attribute1", "attribute2", "attribute3", "attribute4", "attribute5", "createdAtStart", "createdAtEnd", "updatedAtStart", "updatedAtEnd", "email", 0, 0, "ifPaging"))).thenReturn(Collections.emptyList());
        List<User> result = userServiceImplUnderTest.list(user);
        assertEquals(expectedResult, result);
    }

    @Test
    void testGetById() {
        //对UserController的方法进行封装、配置
        Date date = new Date();
        when(mockUserMapper.getById(1)).thenReturn(new User(1 , "mock" , 20 , date , date , "" , "" , "" , "" , "" , "" , "" , "" , "" , "1@rest.local" , 0 , 0 , "" ));
        //期待的结果
        User expectedResult = new User(1 , "mock" , 20 , date , date , "" , "" , "" , "" , "" , "" , "" , "" , "" , "1@rest.local" , 0 , 0 , "" );
        //断言，验证
        Assert.assertEquals(expectedResult , userServiceImplUnderTest.getById(1));
    }

    @Test
    void testAdd() {
        Date date = new Date();
        User user = new User(10, "name", 0, date, date, "attribute1", "attribute2", "attribute3", "attribute4", "attribute5", "createdAtStart", "createdAtEnd", "updatedAtStart", "updatedAtEnd", "email", 0, 0, "ifPaging");
        when(mockUserMapper.add(new User(10, "name", 0, date, date, "attribute1", "attribute2", "attribute3", "attribute4", "attribute5", "createdAtStart", "createdAtEnd", "updatedAtStart", "updatedAtEnd", "email", 0, 0, "ifPaging"))).thenReturn(1);
        Integer result = userServiceImplUnderTest.add(user);
        assertEquals(1, result);
    }

    @Test
    void testUpdate() {
        when(mockUserMapper.update(new User(1, "name", 0, new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime(), new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime(), "attribute1", "attribute2", "attribute3", "attribute4", "attribute5", "createdAtStart", "createdAtEnd", "updatedAtStart", "updatedAtEnd", "email", 0, 0, "ifPaging"))).thenReturn(1);
        User user = new User(1, "name", 0, new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime(), new GregorianCalendar(2020, Calendar.JANUARY, 1).getTime(), "attribute1", "attribute2", "attribute3", "attribute4", "attribute5", "createdAtStart", "createdAtEnd", "updatedAtStart", "updatedAtEnd", "email", 0, 0, "ifPaging");
        Integer result = userServiceImplUnderTest.update(user);
        assertEquals(1, result);
    }

    @Test
    void testDelete() {
        when(mockUserMapper.delete(1)).thenReturn(1);
        assertEquals(1, userServiceImplUnderTest.delete(1));
    }

}
