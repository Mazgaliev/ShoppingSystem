package com.example.shoppingsystem.model;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Proizvod {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;

    String name;

    Integer cena;

    @OneToMany
    List<Dodatok> dodatoci;

    public Proizvod(String name, Integer cena) {
        this.name = name;
        this.cena = cena + dodatoci.stream().mapToInt(Dodatok::getCena).sum();
    }

    public Proizvod() {

    }
}
