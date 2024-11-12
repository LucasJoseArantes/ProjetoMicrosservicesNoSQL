package com.example.user_api.controller;

import com.example.user_api.models.User;
import com.example.user_api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public Optional<User> getUserById(@PathVariable String id) {
        return userService.findById(id);
    }

    @PostMapping
    public User createUser(@RequestBody User user) {
        return userService.save(user);
    }

    @PutMapping("/{id}")
    public User updateUser(@PathVariable String id, @RequestBody User user) {
        return userService.updateUser(id, user);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable String id) {
        userService.delete(id);
    }

    @GetMapping("/search")
    public List<User> findByName(@RequestParam String name) {
        return userService.findByName(name);
    }

    @GetMapping("/cpf/{cpf}")
    public User findByCpf(@PathVariable String cpf) {
        return userService.findByCpf(cpf);
    }

    @PatchMapping("/{id}")
    public User patchUser(@PathVariable String id, @RequestBody User user) {
        return userService.editUser(id, user);
    }
}
