package com.example.lp2.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class Leilao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Integer numLeilao;
	private Integer loteProdutos;
	private String instituicaoFin;
	private Date data;
	private String local;
	
	@JsonIgnore
	@OneToMany(mappedBy = "leilao")
	private List<Imovel> imoveis;
	
	@JsonIgnore
	@OneToMany(mappedBy = "leilao")
	private List<Veiculo> veiculos;
	
	public Leilao() {
		
	};
	
	
	public Leilao(Long id, Integer numLeilao, Integer loteProdutos, String instituicaoFin, Date data, String local) {
		super();
		this.id = id;
		this.numLeilao = numLeilao;
		this.loteProdutos = loteProdutos;
		this.instituicaoFin = instituicaoFin;
		this.data = data;
		this.local = local;
		
	}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getNumLeilao() {
		return numLeilao;
	}
	public void setNumLeilao(Integer numLeilao) {
		this.numLeilao = numLeilao;
	}
	public Integer getLoteProdutos() {
		return loteProdutos;
	}
	public void setLoteProdutos(Integer loteProdutos) {
		this.loteProdutos = loteProdutos;
	}
	public String getInstituicaoFin() {
		return instituicaoFin;
	}
	public void setInstituicaoFin(String instituicaoFin) {
		this.instituicaoFin = instituicaoFin;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public String getLocal() {
		return local;
	}
	public void setLocal(String local) {
		this.local = local;
	}

	public List<Imovel> getImoveis() {
		return imoveis;
	}

	public void setImoveis(List<Imovel> imoveis) {
		this.imoveis = imoveis;
	}

	public List<Veiculo> getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(List<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}

	
	
	
}
