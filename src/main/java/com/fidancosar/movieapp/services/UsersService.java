package com.fidancosar.movieapp.services;

import com.fidancosar.movieapp.entities.Users;
import com.fidancosar.movieapp.model.requests.UsersRequest;

public interface UsersService {
    void add(UsersRequest usersRequest);

}
