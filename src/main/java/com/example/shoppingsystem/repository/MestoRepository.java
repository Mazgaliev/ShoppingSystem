package com.example.shoppingsystem.repository;

import com.example.shoppingsystem.model.Mesto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public abstract interface MestoRepository extends JpaRepository<Mesto, Long> {

}
