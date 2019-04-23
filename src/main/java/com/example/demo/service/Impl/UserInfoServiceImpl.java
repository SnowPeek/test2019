package com.example.demo.service.Impl;


import com.example.demo.dao.LoginDao;
import com.example.demo.entity.UserInfo;
import com.example.demo.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("UserInfoService")
public class UserInfoServiceImpl implements UserInfoService {
    @Autowired
    private LoginDao loginDao;

    @Override
    public List<UserInfo> userInfo(){
        return loginDao.userInfo();
    }

    @Override
    public UserInfo login(UserInfo userInfo){
        return loginDao.login(userInfo);
    }
}
