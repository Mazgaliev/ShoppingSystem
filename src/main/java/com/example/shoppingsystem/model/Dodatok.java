package com.example.shoppingsystem.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Dodatok {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;

    private String cena;

    public Dodatok(String name, String cena) {
        this.name = name;
        this.cena = cena;
    }

    public Dodatok() {

    }
}
