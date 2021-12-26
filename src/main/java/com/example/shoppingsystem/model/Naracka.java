package com.example.shoppingsystem.model;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
public class Naracka {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String name;

    private Integer cena;

    private LocalDateTime dataVreme;

    @ManyToMany
    private List<Proizvod> prozvodi;

    public Naracka(String name) {
        this.name = name;
        this.dataVreme = LocalDateTime.now();
        prozvodi = new ArrayList<>();
    }

    public Naracka() {

    }


}
