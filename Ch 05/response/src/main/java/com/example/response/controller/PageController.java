package com.example.response.controller;

import com.example.response.dto.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class PageController {

    @RequestMapping("/main")
    public String main() {
        return "main.html";
    }

    @ResponseBody
    @GetMapping("/user")
    public User user() {
        var user = new User(); // 타입 추론
        user.setName("steve");
        user.setAddress("패스트 캠퍼스");
        user.setPhoneNumber("010-1111-2222");
        user.setAge(10);
        return user;
    }

}