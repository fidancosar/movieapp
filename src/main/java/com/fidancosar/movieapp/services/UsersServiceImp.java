package com.fidancosar.movieapp.services;

import com.fidancosar.movieapp.entities.Users;
import com.fidancosar.movieapp.model.requests.UsersRequest;
import com.fidancosar.movieapp.repositories.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service

public class UsersServiceImp implements UsersService{
    private final UsersRepository usersRepository;

    public UsersServiceImp(UsersRepository usersRepository) {
        this.usersRepository = usersRepository;
    }

    @Override
    public void add(UsersRequest usersRequest) {
        Users users = new Users();
        users.setId(users.getId());

        usersRepository.save(users);
    }

}
