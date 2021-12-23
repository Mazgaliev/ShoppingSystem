package com.example.shoppingsystem.model;

import lombok.Data;
import lombok.Generated;

import javax.persistence.*;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;

    private String surname;
    @Column(name = "_password")
    private String password;

    private String phoneNumber;

    public User(String name, String surname, String password, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.password = password;
        this.phoneNumber = phoneNumber;
    }

    public User() {

    }
}
