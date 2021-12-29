package com.example.shoppingsystem.service;

import com.example.shoppingsystem.model.Naracka;

import java.time.LocalDateTime;
import java.util.List;

public interface NarackaService {

    Naracka createNaracka(Naracka naracka);

    List<Naracka> getAllOrders();

    List<Naracka> getTodaysOrders();
}
