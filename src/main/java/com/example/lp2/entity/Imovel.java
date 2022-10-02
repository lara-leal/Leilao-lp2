package com.example.lp2.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Imovel {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String endereco;
	private String cidade;
	private String estado;
	private Double areaTerreno;
	private String descricao;
	private String tipoImovel;
	
	@ManyToOne
	@JoinColumn(name = "id_leilao")
	private Leilao leilao;
	
	public Imovel(Long id,String endereco, String cidade, String estado, Double areaTerreno, String descricao, String tipoImovel) {
		super();
		this.id = id;
		this.endereco = endereco;
		this.cidade = cidade;
		this.estado = estado;
		this.areaTerreno = areaTerreno;
		this.descricao = descricao;
		this.tipoImovel = tipoImovel;
	}
	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public Double getAreaTerreno() {
		return areaTerreno;
	}
	public void setAreaTerreno(Double areaTerreno) {
		this.areaTerreno = areaTerreno;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getTipoImovel() {
		return tipoImovel;
	}
	public void setTipoImovel(String tipoImovel) {
		this.tipoImovel = tipoImovel;
	}
	public Leilao getLeilao() {
		return leilao;
	}
	public void setLeilao(Leilao leilao) {
		this.leilao = leilao;
	}
	
	
	
	
	
}
