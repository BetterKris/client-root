package com.client.user.model;

import com.client.user.entity.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserModel extends User {
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

}
