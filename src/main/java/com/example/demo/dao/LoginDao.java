package com.example.demo.dao;


import com.example.demo.entity.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component("LoginDao")
public interface LoginDao {
    List<UserInfo> userInfo();

    UserInfo login(UserInfo userInfo);
}
