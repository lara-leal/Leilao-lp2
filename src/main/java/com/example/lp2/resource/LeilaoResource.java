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

import com.example.lp2.dtos.LeilaoDTO;
import com.example.lp2.entity.Leilao;
import com.example.lp2.service.LeilaoService;


@CrossOrigin
@RestController
@RequestMapping(value = "/leiloes")
public class LeilaoResource {
	

	@Autowired
	private LeilaoService service;
	

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Leilao>> findAll() {
		List<Leilao> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Leilao> findById(@PathVariable Long id) {
		Leilao leilao = service.findById(id);
		return ResponseEntity.ok().body(leilao);
	}

	@PostMapping
	public ResponseEntity<Leilao> saveLeilao(@RequestBody LeilaoDTO objDto) {
		Leilao obj = service.FromDTO(objDto);
		obj = service.save(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}

	@PutMapping(value= "/{id}")
	public ResponseEntity<Leilao> updateLeilao(@PathVariable Long id, @RequestBody Leilao obj){
		Leilao updateLeilao = service.update(id, obj);
		return ResponseEntity.ok().body(updateLeilao);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}


}
