package com.example.lp2.dtos;


import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.example.lp2.entity.Leilao;

public class InstituicaoFinanceiraDTO {
	


	private Long id;
	
	private String cnpjEntidadeFinanceira;
	
	private String nome;
	
	private String endereco;
	
	private Leilao leilao;
	
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}



	public String getCnpjEntidadeFinanceira() {
		return cnpjEntidadeFinanceira;
	}

	public void setCnpjEntidadeFinanceira(String cnpjEntidadeFinanceira) {
		this.cnpjEntidadeFinanceira = cnpjEntidadeFinanceira;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	
	public Leilao getLeilao() {
		return leilao;
	}

	public void setLeilao(Leilao leilao) {
		this.leilao = leilao;
	}
	

}
