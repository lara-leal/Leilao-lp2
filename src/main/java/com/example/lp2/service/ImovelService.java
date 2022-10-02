package com.example.lp2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lp2.dtos.ImovelDTO;
import com.example.lp2.entity.Imovel;
import com.example.lp2.repository.ImovelRepository;

@Service
public class ImovelService {

	@Autowired
	private ImovelRepository repository;

	public List<Imovel> findAll() {
		return repository.findAll();
	}

	public Imovel findById(Long id) {
		Optional<Imovel> obj = repository.findById(id);
		return obj.get();
	}

	public Imovel save(Imovel obj) {
		return repository.save(obj);
	}

	public Imovel update(Long id, Imovel obj) {
		Imovel updateImovel = findById(id);
		updateImovel.setEndereco(obj.getEndereco());
		updateImovel.setCidade(obj.getCidade());
		updateImovel.setEstado(obj.getEstado());
		updateImovel.setAreaTerreno(obj.getAreaTerreno());
		updateImovel.setDescricao(obj.getDescricao());
		updateImovel.setTipoImovel(obj.getTipoImovel());
		
		return repository.save(updateImovel);
}

	public void delete(Long id) {
		repository.deleteById(id);
	}

	public Imovel FromDTO(ImovelDTO objDto) {
		return new Imovel(objDto.getId(), objDto.getEndereco(), objDto.getCidade(), objDto.getEstado(),
				objDto.getAreaTerreno(), objDto.getDescricao(), objDto.getTipoImovel());
	}

}

