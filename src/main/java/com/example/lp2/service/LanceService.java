package com.example.lp2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lp2.dtos.LanceDTO;
import com.example.lp2.entity.Lance;
import com.example.lp2.repository.LanceRepository;

@Service
public class LanceService {
	
	@Autowired
	private LanceRepository repository;

	public List<Lance> findAll() {
		return repository.findAll();
	}

	public Lance findById(Long id) {
		Optional<Lance> obj = repository.findById(id);
		return obj.get();
	}

	public Lance save(Lance obj) {
		return repository.save(obj);
	}

	public Lance update(Long id, Lance obj) {
		Lance updateLance = findById(id);
		updateLance.setValor(obj.getValor());
		return repository.save(updateLance);
}

	public void delete(Long id) {
		repository.deleteById(id);
	}

	public Lance FromDTO(LanceDTO objDto) {
		return new Lance(objDto.getId(), objDto.getValor());
	}


}
