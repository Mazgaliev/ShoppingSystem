package com.example.shoppingsystem.service.implementation;

import com.example.shoppingsystem.model.Naracka;
import com.example.shoppingsystem.repository.NarackaRepository;
import com.example.shoppingsystem.service.NarackaService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.List;

@Service
public class NarackaServiceImplementation implements NarackaService {
    private final NarackaRepository narackaRepository;

    public NarackaServiceImplementation(NarackaRepository narackaRepository) {
        this.narackaRepository = narackaRepository;
    }

    @Override
    public Naracka createNaracka(Naracka naracka) {
        return narackaRepository.save(naracka);
    }

    @Override
    public List<Naracka> getAllOrders() {
        return narackaRepository.findAll();
    }

    @Override
    public List<Naracka> getTodaysOrders() {
        LocalDateTime data1 = LocalDateTime.now();
        LocalDateTime startDay = data1.with(LocalTime.MIN);
        LocalDateTime endDay = data1.with(LocalTime.MAX);


        return narackaRepository.getByDataVremeIsBetween(startDay, endDay);
    }
}
