package com.example.shoppingsystem.service;

import com.example.shoppingsystem.model.Naracka;

import java.util.List;

public interface NarackaService {

    Naracka createNaracka(String name);

    List<Naracka> getAllOrders();

}
