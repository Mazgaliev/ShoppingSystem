package com.example.shoppingsystem.repository;

import com.example.shoppingsystem.model.Naracka;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.List;

@Repository
public interface NarackaRepository extends JpaRepository<Naracka, Long> {

    Naracka save(Naracka naracka);

    List<Naracka> getByDataVremeAfter(LocalDateTime dateTime);
}
