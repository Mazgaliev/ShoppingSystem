package com.example.shoppingsystem.repository;

import com.example.shoppingsystem.model.Proizvod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProizvodRepository extends JpaRepository<Proizvod, Long> {
    Proizvod save(Proizvod proizvod);

    List<Proizvod> findAll();

    Optional<Proizvod> findById(Long id);
}
