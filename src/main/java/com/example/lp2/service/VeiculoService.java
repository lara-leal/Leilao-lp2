package com.example.lp2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lp2.dtos.VeiculoDTO;
import com.example.lp2.entity.Veiculo;
import com.example.lp2.repository.VeiculoRepository;

@Service
public class VeiculoService {
	
	@Autowired
	private VeiculoRepository repository;

	public List<Veiculo> findAll() {
		return repository.findAll();
	}

	public Veiculo findById(Long id) {
		Optional<Veiculo> obj = repository.findById(id);
		return obj.get();
	}

	public Veiculo save(Veiculo obj) {
		return repository.save(obj);
	}

	public Veiculo update(Long id, Veiculo obj) {
		Veiculo updateVeiculo = findById(id);
		updateVeiculo.setDataFabricacao(obj.getDataFabricacao());
		updateVeiculo.setModelo(obj.getModelo());
		updateVeiculo.setPlaca(obj.getPlaca());
		updateVeiculo.setTipoVeiculo(obj.getTipoVeiculo());
		updateVeiculo.setDescricao(obj.getDescricao());
		return repository.save(updateVeiculo);
}

	public void delete(Long id) {
		repository.deleteById(id);
	}

	public Veiculo FromDTO(VeiculoDTO objDto) {
		return new Veiculo(objDto.getId(), objDto.getDataFabricacao(), objDto.getModelo(), objDto.getPlaca(), objDto.getTipoVeiculo(),objDto.getDescricao());
	}


}
