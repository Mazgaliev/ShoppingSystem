package com.example.shoppingsystem.model;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Proizvod {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

    String name;

    Integer cena;

    @ManyToMany
    List<Dodatok> dodatoci;

    public Proizvod(String name, Integer cena) {
        this.name = name;
        dodatoci = new ArrayList<>();
        this.cena = cena;
    }

    public Proizvod() {

    }
}
