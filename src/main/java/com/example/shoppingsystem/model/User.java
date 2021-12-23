package com.example.shoppingsystem.model;

import lombok.Data;
import lombok.Generated;

import javax.persistence.*;

@Data
@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;

    private String surname;

    private String username;

    private String password;

    private String phoneNumber;

    public User(String name, String surname, String username, String password, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.username = username;
    }

    public User() {

    }
}
