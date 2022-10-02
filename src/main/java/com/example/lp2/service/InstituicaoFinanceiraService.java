package com.example.lp2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lp2.dtos.InstituicaoFinanceiraDTO;
import com.example.lp2.entity.InstituicaoFinanceira;
import com.example.lp2.repository.InstituicaoFinanceiraRepository;


@Service
public class InstituicaoFinanceiraService {
	
	@Autowired
	private InstituicaoFinanceiraRepository repository;

	public List<InstituicaoFinanceira> findAll() {
		return repository.findAll();
	}

	public InstituicaoFinanceira findById(Long id) {
		Optional<InstituicaoFinanceira> obj = repository.findById(id);
		return obj.get();
	}

	public InstituicaoFinanceira save(InstituicaoFinanceira obj) {
		return repository.save(obj);
	}

	public InstituicaoFinanceira update(Long id, InstituicaoFinanceira obj) {
		InstituicaoFinanceira updateInstituicaoFinanceira = findById(id);
		updateInstituicaoFinanceira.setCnpjEntidadeFinanceira(obj.getCnpjEntidadeFinanceira());
		updateInstituicaoFinanceira.setNome(obj.getNome());
		updateInstituicaoFinanceira.setEndereco(obj.getEndereco());
		
		
		return repository.save(updateInstituicaoFinanceira);
}

	public void delete(Long id) {
		repository.deleteById(id);
	}

	public InstituicaoFinanceira FromDTO(InstituicaoFinanceiraDTO objDto) {
		return new InstituicaoFinanceira(objDto.getId(), objDto.getCnpjEntidadeFinanceira(), objDto.getNome(), objDto.getEndereco());
	}


}
