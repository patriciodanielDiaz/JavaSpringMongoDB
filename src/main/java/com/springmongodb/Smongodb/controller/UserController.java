package com.springmongodb.Smongodb.controller;

import com.springmongodb.Smongodb.model.User;
import com.springmongodb.Smongodb.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/")
public class UserController {

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/")
    public ResponseEntity<List<User>> getUser(){
        return userService.allUser();
    }
    @PostMapping("/")
    public ResponseEntity<User> createUser(User user){
        User newUser =userService.createUser(user);
        return  ResponseEntity.ok(newUser);
    }
}
