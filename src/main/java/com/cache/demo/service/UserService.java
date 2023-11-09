/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cache.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 *
 * @author lenovo
 */
@Service
public class UserService {

    @Cacheable(value = "UserCache", unless = "#result == null")
    public String getName(Long id) {

        System.out.print("Reqeust for getting cache.");
        return "Alamgir Kabir";
    }

    @Cacheable("test")
    public String test() {
        System.out.print("Reqeust for getting test cache.");
        return "Cache test";
    }
}
