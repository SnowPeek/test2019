package com.example.demo.service;


import com.example.demo.entity.UserInfo;

import java.util.List;

public interface UserInfoService {
    List<UserInfo> userInfo();

    UserInfo login(UserInfo userInfo);}
