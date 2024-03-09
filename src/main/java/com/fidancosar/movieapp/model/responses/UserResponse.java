package com.fidancosar.movieapp.model.responses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {
    private int id;
    private String name;
    private String lastName;
    private String mailAdress;
    private String password;
}

