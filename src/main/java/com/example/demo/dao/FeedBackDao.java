package com.example.demo.dao;

import com.example.demo.entity.FeedBack;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

import java.util.List;

@Mapper
@Component("FeedBackDao")
public interface FeedBackDao {
    List<FeedBack> findList();
}
