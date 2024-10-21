package com.example.user_api.dto;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO {
    private String name;
    private String cpf;
    private String adress;
    private String email;
    private String phone;
    private LocalDateTime signUpDate;
    
}
