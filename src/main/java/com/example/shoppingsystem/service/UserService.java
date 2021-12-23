package com.example.shoppingsystem.service;

import com.example.shoppingsystem.model.User;

import java.util.List;

public interface UserService {
    List<User> listAllUsers();

    User getUserById(Long id);

    User createUser(String name,String surname,String phoneNum,String username,String password);
}
