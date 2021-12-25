package com.example.shoppingsystem.service.implementation;

import com.example.shoppingsystem.model.Dodatok;
import com.example.shoppingsystem.repository.DodatokRepository;
import com.example.shoppingsystem.service.DodatokService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DodatokServiceImplementation implements DodatokService {
    private final DodatokRepository dodatokRepository;

    public DodatokServiceImplementation(DodatokRepository dodatokRepository) {
        this.dodatokRepository = dodatokRepository;
    }

    @Override
    public Dodatok createDodatok(String name, Integer cena) {
        return dodatokRepository.save(new Dodatok(name, cena));
    }

    @Override
    public List<Dodatok> getAllDodatoci() {
        return dodatokRepository.findAll();
    }
}
