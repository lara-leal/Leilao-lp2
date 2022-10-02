package com.example.lp2.dtos;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.example.lp2.entity.Lance;

public class ClienteDTO {

	private Long id;
	private String name;
	private String email;
	private String cpf;
	private String certificadoDig;
	private Lance lance;
	
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getCertificadoDig() {
		return certificadoDig;
	}
	public void setCertificadoDig(String certificadoDig) {
		this.certificadoDig = certificadoDig;
	}
	
	public Lance getLance() {
		return lance;
	}
	public void setLance(Lance lance) {
		this.lance = lance;
	}
	
	
	
	
}
