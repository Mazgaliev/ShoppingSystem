package com.example.shoppingsystem.repository;

import com.example.shoppingsystem.model.Dodatok;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DodatokRepository extends JpaRepository<Dodatok, Long> {
    Dodatok save(Dodatok dodatok);

    List<Dodatok> findAll();

}
