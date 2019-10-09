package org.ie.spring.cloud.web.admin.feign.controller;

import org.ie.spring.cloud.web.admin.feign.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdminController {
    @Autowired
    AdminService adminService;
    @RequestMapping("hi")
    public String sayHi(String message){
        return adminService.sayHi(message);
    }
}
