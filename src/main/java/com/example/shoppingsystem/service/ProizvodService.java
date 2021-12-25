package com.example.shoppingsystem.service;

import com.example.shoppingsystem.model.Proizvod;

import java.util.List;

public interface ProizvodService {

    List<Proizvod> getAllItems();

    Proizvod getProizvById(Long id);

    Proizvod createProizvod(String name, Integer cena);

}
