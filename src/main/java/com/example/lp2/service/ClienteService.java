package com.example.lp2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lp2.dtos.ClienteDTO;
import com.example.lp2.entity.Cliente;
import com.example.lp2.repository.ClienteRepository;

@Service
public class ClienteService {
	

	@Autowired
	private ClienteRepository repository;

	public List<Cliente> findAll() {
		return repository.findAll();
	}

	public Cliente findById(Long id) {
		Optional<Cliente> obj = repository.findById(id);
		return obj.get();
	}

	public Cliente save(Cliente obj) {
		return repository.save(obj);
	}

	public Cliente update(Long id, Cliente obj) {
		Cliente updateCli = findById(id);
		updateCli.setName(obj.getName());
		updateCli.setEmail(obj.getEmail());
		updateCli.setCpf(obj.getCpf());
		return repository.save(updateCli);
}

	public void delete(Long id) {
		repository.deleteById(id);
	}

	public Cliente FromDTO(ClienteDTO objDto) {
		return new Cliente(objDto.getId(), objDto.getName(), objDto.getEmail(), objDto.getCpf(),
				objDto.getCertificadoDig());
	}

}



