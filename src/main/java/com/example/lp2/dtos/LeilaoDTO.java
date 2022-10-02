package com.example.lp2.dtos;

import java.util.Date;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.example.lp2.entity.Imovel;
import com.example.lp2.entity.Veiculo;
import com.fasterxml.jackson.annotation.JsonIgnore;

public class LeilaoDTO {
	

	private Long id;
	private Integer numLeilao;
	private Integer loteProdutos;
	private String instituicaoFin;
	private Date data;
	private String local;
	private Imovel imovel;
	private Veiculo veiculo;
	
	
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

	public Veiculo getVeiculo() {
		return veiculo;
	}

	public void setVeiculo(Veiculo veiculo) {
		this.veiculo = veiculo;
	}

	public Imovel getImovel() {
		return imovel;
	}

	public void setImovel(Imovel imovel) {
		this.imovel = imovel;
	}
	

}
