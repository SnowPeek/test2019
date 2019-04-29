package com.example.demo.controller;


import com.example.demo.entity.FeedBack;
import com.example.demo.service.FeedBackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
public class FeedBackController {
    @Autowired
    private FeedBackService feedBackService;
    @RequestMapping(value = "/feedback" , method = RequestMethod.GET)
    public String feedback(Model model){
        List<FeedBack> feedBacks = feedBackService.findList();
        model.addAttribute("feedBacks",feedBacks);
        return "/feedback";
    }
}
