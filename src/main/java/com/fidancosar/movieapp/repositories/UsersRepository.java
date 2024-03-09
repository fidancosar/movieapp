package com.fidancosar.movieapp.repositories;

import com.fidancosar.movieapp.entities.Users;
import org.apache.catalina.User;
import org.aspectj.apache.bcel.classfile.Module;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository <Users, Integer> {
}
