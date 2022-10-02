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

import com.example.lp2.dtos.ImovelDTO;
import com.example.lp2.entity.Imovel;
import com.example.lp2.service.ImovelService;

@CrossOrigin
@RestController
@RequestMapping(value = "/imoveis")
public class ImovelResource {

	

	@Autowired
	private ImovelService service;
	

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Imovel>> findAll() {
		List<Imovel> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Imovel> findById(@PathVariable Long id) {
		Imovel imo = service.findById(id);
		return ResponseEntity.ok().body(imo);
	}

	@PostMapping
	public ResponseEntity<Imovel> saveImovel(@RequestBody ImovelDTO objDto) {
		Imovel obj = service.FromDTO(objDto);
		obj = service.save(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}

	@PutMapping(value= "/{id}")
	public ResponseEntity<Imovel> updateImovel(@PathVariable Long id, @RequestBody Imovel obj){
		Imovel updateImovel = service.update(id, obj);
		return ResponseEntity.ok().body(updateImovel);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}

}
