package com.example.shoppingsystem.model;

import lombok.Data;
import lombok.Generated;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
public class Mesto {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;

    private String location;

    @ManyToOne
    private User korisnik;

    @OneToMany
    List<Proizvod> proizvodList;
//    private List<Naracka> narackaList;
//
//    private List<Proizvod> proizvodList;

    public Mesto(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public Mesto() {

    }
}
