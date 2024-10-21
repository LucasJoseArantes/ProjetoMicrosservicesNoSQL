package com.example.user_api.controller;

import org.springframework.web.bind.annotation.RestController;
import com.example.user_api.dto.UserDTO;
import jakarta.annotation.PostConstruct;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/user")
public class UserController {

    public static List<UserDTO> users = new ArrayList<UserDTO>();

    @PostConstruct
    public void initiateList() {
        UserDTO userDTO = new UserDTO();
        userDTO.setName("Eduardo");
        userDTO.setCpf("123");
        userDTO.setAdress("Rua a");
        userDTO.setEmail("eduardo@email.com");
        userDTO.setPhone("1234-3454");
        userDTO.setSignUpDate(LocalDateTime.now());
        users.add(userDTO);
    }

    @GetMapping
    public List<UserDTO> getUsers() {
        return users;
    }

    @GetMapping("/{cpf}")
    public UserDTO getUserByCpf(@PathVariable String cpf) {
        return users.stream()
            .filter(user -> user.getCpf().equals(cpf))
            .findFirst()
            .orElseThrow(() -> new RuntimeException("User not found"));
    }
}
