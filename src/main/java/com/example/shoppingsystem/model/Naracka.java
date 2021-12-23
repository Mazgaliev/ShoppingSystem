package com.example.shoppingsystem.model;

import lombok.Data;
import lombok.Generated;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Entity
public class Naracka {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @OneToMany
    private List<Proizvod> proizvodList;

    private int finalnaCena;

    private LocalDateTime vreme;

    public Naracka(int finalnaCena, LocalDateTime vreme) {
        this.finalnaCena = proizvodList.stream().mapToInt(Proizvod::getCena).sum();
        this.vreme = vreme;
    }

    public Naracka() {

    }
}
