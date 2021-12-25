package com.example.shoppingsystem.service.implementation;

import com.example.shoppingsystem.model.Proizvod;
import com.example.shoppingsystem.repository.ProizvodRepository;
import com.example.shoppingsystem.service.ProizvodService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProizvodServiceImplementation implements ProizvodService {
    private final ProizvodRepository proizvodRepository;

    public ProizvodServiceImplementation(ProizvodRepository proizvodRepository) {
        this.proizvodRepository = proizvodRepository;
    }

    @Override
    public List<Proizvod> getAllItems() {
        return proizvodRepository.findAll();
    }

    @Override
    public Proizvod getProizvById(Long id) {
        return proizvodRepository.findById(id).get();
    }

    @Override
    public Proizvod createProizvod(String name, Integer cena) {
        return proizvodRepository.save(new Proizvod(name, cena));
    }
}
