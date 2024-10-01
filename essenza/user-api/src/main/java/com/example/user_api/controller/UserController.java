package com.example.user_api.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.user_api.dto.UserDTO;
import com.example.user_api.repository.UserRepository;

import jakarta.annotation.PostConstruct;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserRepository userRepository;

    public static List<UserDTO> usuarios = new ArrayList<>();
    
     @PostMapping
    public User createUser(@RequestBody User user) {
        user.setSignUpDate(LocalDateTime.now());
        return userRepository.save(user);
 
    }
    @PostConstruct
    public void initiateList() {
        UserDTO userDTO = new UserDTO();
        
    }

    @GetMapping
    public List<UserDTO> getUsers() {
        return usuarios;
    }

}   
