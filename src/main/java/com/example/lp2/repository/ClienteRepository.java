package com.example.lp2.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.lp2.entity.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}