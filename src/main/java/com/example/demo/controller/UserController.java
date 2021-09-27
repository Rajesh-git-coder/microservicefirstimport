package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.Model.User;
import com.example.demo.service.UserService;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
	private UserService service;
    
    @GetMapping("/register")
    public String userReg() {
    	return "UserRegister";
    }
    
    @PostMapping("/save")
    public String saveUser(@ModelAttribute User user,Model model) {
    	Integer msg=service.usersave(user);
    	model.addAttribute("msg","User'"+msg+"'id created");
    	return "UserRegister";
    }
}
