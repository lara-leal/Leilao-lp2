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

import com.example.lp2.dtos.LanceDTO;
import com.example.lp2.entity.Lance;
import com.example.lp2.service.LanceService;


@CrossOrigin
@RestController
@RequestMapping(value = "/lances")
public class LanceResource {


	@Autowired
	private LanceService service;
	

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<Lance>> findAll() {
		List<Lance> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<Lance> findById(@PathVariable Long id) {
		Lance lance = service.findById(id);
		return ResponseEntity.ok().body(lance);
	}

	@PostMapping
	public ResponseEntity<Lance> saveLance(@RequestBody LanceDTO objDto) {
		Lance obj = service.FromDTO(objDto);
		obj = service.save(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}

	@PutMapping(value= "/{id}")
	public ResponseEntity<Lance> updateLance(@PathVariable Long id, @RequestBody Lance obj){
		Lance updateLance = service.update(id, obj);
		return ResponseEntity.ok().body(updateLance);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}

}
