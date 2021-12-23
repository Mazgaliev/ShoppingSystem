package com.example.shoppingsystem.repository;

import com.example.shoppingsystem.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    List<User> findAll();

    User getById(Long id);

    User save(User user);
}
