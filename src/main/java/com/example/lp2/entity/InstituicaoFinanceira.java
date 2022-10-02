package com.example.lp2.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class InstituicaoFinanceira {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String cnpjEntidadeFinanceira;
	
	private String nome;
	
	private String endereco;
	
	

	public InstituicaoFinanceira(Long id,  String cnpjEntidadeFinanceira, String nome, String endereco) {
		super();
		this.id = id;
		this.cnpjEntidadeFinanceira = cnpjEntidadeFinanceira;
		this.nome = nome;
		this.endereco = endereco;
	}
	
	

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
	
}
