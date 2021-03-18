package com.springmongodb.Smongodb.service;

import com.springmongodb.Smongodb.model.User;
import com.springmongodb.Smongodb.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User createUser(User user) {
        return userRepository.save(user);
    }

    public ResponseEntity<List<User>> allUser() {
        List<User> list= userRepository.findAll();
        return ResponseEntity.ok(list);
    }
}
