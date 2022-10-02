package com.example.lp2.resource;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.lp2.dtos.VeiculoDTO;
import com.example.lp2.entity.Veiculo;
import com.example.lp2.service.VeiculoService;


@CrossOrigin
@RestController
@RequestMapping(value = "/veiculos")
public class VeiculoResource {
	
	

	@Autowired
	private VeiculoService service;
	

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Veiculo>> findAll() {
		List<Veiculo> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Veiculo> findById(@PathVariable Long id) {
		Veiculo veiculo = service.findById(id);
		return ResponseEntity.ok().body(veiculo);
	}

	@PostMapping
	public ResponseEntity<Veiculo> saveVeiculo(@RequestBody VeiculoDTO objDto) {
		Veiculo obj = service.FromDTO(objDto);
		obj = service.save(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}

	@PutMapping(value= "/{id}")
	public ResponseEntity<Veiculo> updateVeiculo(@PathVariable Long id, @RequestBody Veiculo obj){
		Veiculo updateVeiculo = service.update(id, obj);
		return ResponseEntity.ok().body(updateVeiculo);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}

}
