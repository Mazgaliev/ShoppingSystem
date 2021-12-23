package com.example.shoppingsystem.service.implementation;

import com.example.shoppingsystem.model.User;
import com.example.shoppingsystem.repository.UserRepository;
import com.example.shoppingsystem.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> listAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.getById(id);
    }

    @Override
    public User createUser(String name, String surname, String phoneNum, String username, String password) {
        return userRepository.save(new User(name, surname, username, password, phoneNum));
    }
}
