package com.client.user.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class User{
    //表属性
    private Integer id;
    private String name;
    private Integer age;
    private Date createdAt;
    private Date updatedAt;
    private String attribute1;
    private String attribute2;
    private String attribute3;
    private String attribute4;
    private String attribute5;
    //查询扩展字段
    private String createdAtStart;
    private String createdAtEnd;
    private String updatedAtStart;
    private String updatedAtEnd;
    private String email;
    private int pageNum;
    private int pageSize;
    private String ifPaging;

    public User(Integer id) {
        this.id = id;
    }
}
