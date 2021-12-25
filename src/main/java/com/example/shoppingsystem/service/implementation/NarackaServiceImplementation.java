package com.example.shoppingsystem.service.implementation;

import com.example.shoppingsystem.model.Naracka;
import com.example.shoppingsystem.repository.NarackaRepository;
import com.example.shoppingsystem.service.NarackaService;
import org.springframework.stereotype.Service;

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
}
