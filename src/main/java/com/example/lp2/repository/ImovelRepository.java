package com.example.lp2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.lp2.entity.Imovel;






	public interface ImovelRepository extends JpaRepository<Imovel, Long> {
}

