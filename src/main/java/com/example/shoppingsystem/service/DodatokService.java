package com.example.shoppingsystem.service;

import com.example.shoppingsystem.model.Dodatok;

import java.util.List;

public interface DodatokService {

    Dodatok createDodatok(String name, Integer cena);

    List<Dodatok> getAllDodatoci();

}
