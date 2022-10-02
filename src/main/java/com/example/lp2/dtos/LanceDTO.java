package com.example.lp2.dtos;

import com.example.lp2.entity.Cliente;
import com.example.lp2.entity.Leilao;

public class LanceDTO {
	
	
	private Long id;
	private String valor;
	private Cliente cliente;
	private Leilao leilao;
	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getValor() {
		return valor;
	}


	public void setValor(String valor) {
		this.valor = valor;
	}


	public Cliente getCliente() {
		return cliente;
	}


	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}


	public Leilao getLeilao() {
		return leilao;
	}


	public void setLeilao(Leilao leilao) {
		this.leilao = leilao;
	}
	
	

}
