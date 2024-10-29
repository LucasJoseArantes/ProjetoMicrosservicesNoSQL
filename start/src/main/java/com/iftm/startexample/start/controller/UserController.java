package com.iftm.startexample.start.controller;

import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iftm.startexample.start.model.User;
import com.iftm.startexample.start.model.dto.UserDTO;
import com.iftm.startexample.start.services.UserService;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public ResponseEntity<List<UserDTO>> findAll(){
        return userService.findAll();
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<UserDTO> findById(@PathVariable ObjectId id) {
        return userService.findById(id);
    }

    @PostMapping
    public ResponseEntity<UserDTO> create(@RequestBody User user) {
        return userService.save(user);
    }

    @PutMapping
    public ResponseEntity<UserDTO> update(@RequestBody UserDTO user) {
        return userService.update(user);
    }

    @DeleteMapping("/id/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") ObjectId id) {
        return userService.delete(id);
    }
}