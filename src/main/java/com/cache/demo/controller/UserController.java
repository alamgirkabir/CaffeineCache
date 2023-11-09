/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cache.demo.controller;

import com.cache.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author lenovo
 */
@RestController
public class UserController {
    
    @Autowired
    private UserService userService;
            
    @GetMapping
    public String getName(){
        return userService.getName(1L);
    }
    
    @GetMapping("/test")
    public String test(){
        return userService.test();
    }
}
