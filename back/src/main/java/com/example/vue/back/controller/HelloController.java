package com.example.vue.back.controller;



import com.example.vue.back.model.UserDO;
import com.example.vue.back.repository.UserDaoRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

//加上这个后可以自动吧对象转换为json
@RestController
public class HelloController {



    @Autowired
    private UserDaoRepository userDaoRepository;

    @GetMapping("/")
    public List<UserDO> hello(){

        return  userDaoRepository.findAll();
    }






}
