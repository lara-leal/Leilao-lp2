package com.example.lp2.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.lp2.dtos.LeilaoDTO;
import com.example.lp2.entity.Leilao;
import com.example.lp2.repository.LeilaoRepository;

@Service
public class LeilaoService {

	@Autowired
	private LeilaoRepository repository;

	public List<Leilao> findAll() {
		return repository.findAll();
	}

	public Leilao findById(Long id) {
		Optional<Leilao> obj = repository.findById(id);
		return obj.get();
	}

	public Leilao save(Leilao obj) {
		return repository.save(obj);
	}

	public Leilao update(Long id, Leilao obj) {
		Leilao updateLeilao = findById(id);
		updateLeilao.setNumLeilao(obj.getNumLeilao());
		updateLeilao.setLoteProdutos(obj.getLoteProdutos());
		updateLeilao.setInstituicaoFin(obj.getInstituicaoFin());
		updateLeilao.setData(obj.getData());
		updateLeilao.setLocal(obj.getLocal());
		return repository.save(updateLeilao);
}

	public void delete(Long id) {
		repository.deleteById(id);
	}

	public Leilao FromDTO(LeilaoDTO objDto) {
		return new Leilao(objDto.getId(), objDto.getNumLeilao(), objDto.getLoteProdutos(), objDto.getInstituicaoFin(), objDto.getData(),objDto.getLocal());
	}



}
