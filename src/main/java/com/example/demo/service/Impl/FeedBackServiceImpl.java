package com.example.demo.service.Impl;


import com.example.demo.dao.FeedBackDao;
import com.example.demo.entity.FeedBack;
import com.example.demo.service.FeedBackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("FeedBackService")
public class FeedBackServiceImpl implements FeedBackService {
    @Autowired
    private FeedBackDao feedBackDao;
    @Override
    public List<FeedBack> findList(){
        return feedBackDao.findList();
    }
}
