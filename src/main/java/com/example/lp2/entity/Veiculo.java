package com.example.lp2.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity

public class Veiculo {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String dataFabricacao;
	private String modelo;
	private String placa;
	private String tipoVeiculo;
	private String descricao;
	
	@ManyToOne
	@JoinColumn(name = "id_leilao")
	private Leilao leilao;
	
	public Veiculo() {
		
	};
	
	public Veiculo(Long id, String dataFabricacao, String modelo, String placa, String tipoVeiculo, String descricao) {
		super();
		this.id = id;
		this.dataFabricacao = dataFabricacao;
		this.modelo = modelo;
		this.placa = placa;
		this.tipoVeiculo = tipoVeiculo;
		this.descricao = descricao;
	}
	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDataFabricacao() {
		return dataFabricacao;
	}
	public void setDataFabricacao(String dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getTipoVeiculo() {
		return tipoVeiculo;
	}
	public void setTipoVeiculo(String tipoVeiculo) {
		this.tipoVeiculo = tipoVeiculo;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
	
}
