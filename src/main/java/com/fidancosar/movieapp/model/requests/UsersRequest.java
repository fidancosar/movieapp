package com.fidancosar.movieapp.model.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UsersRequest {
    private int id;
    private String name;
    private String lastName;
    private String mailAddress;
    private String password;
}
