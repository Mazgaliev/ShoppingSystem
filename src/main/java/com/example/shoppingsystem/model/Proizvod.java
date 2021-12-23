package com.example.shoppingsystem.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Data
@Entity
public class Proizvod {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

    private String name;

    private int cena;

    public Proizvod(String name, int cena) {
        this.name = name;
        this.cena = cena;
    }

    public Proizvod() {

    }
}
