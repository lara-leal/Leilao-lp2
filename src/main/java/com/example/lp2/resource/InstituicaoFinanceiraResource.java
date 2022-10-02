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

import com.example.lp2.dtos.InstituicaoFinanceiraDTO;
import com.example.lp2.entity.InstituicaoFinanceira;
import com.example.lp2.service.InstituicaoFinanceiraService;


@CrossOrigin
@RestController
@RequestMapping(value = "/instituicoesfinanceiras")
public class InstituicaoFinanceiraResource {
	
	

	@Autowired
	private InstituicaoFinanceiraService service;
	

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<InstituicaoFinanceira>> findAll() {
		List<InstituicaoFinanceira> list = service.findAll();
		return ResponseEntity.ok().body(list);
	}

	@GetMapping(value = "/{id}")
	public ResponseEntity<InstituicaoFinanceira> findById(@PathVariable Long id) {
		InstituicaoFinanceira ins = service.findById(id);
		return ResponseEntity.ok().body(ins);
	}

	@PostMapping
	public ResponseEntity<InstituicaoFinanceira> saveInstituicaoFinanceira(@RequestBody InstituicaoFinanceiraDTO objDto) {
		InstituicaoFinanceira obj = service.FromDTO(objDto);
		obj = service.save(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}

	@PutMapping(value= "/{id}")
	public ResponseEntity<InstituicaoFinanceira> updateInstituicaoFinanceira(@PathVariable Long id, @RequestBody InstituicaoFinanceira obj){
		InstituicaoFinanceira updateInstituicaoFinanceira = service.update(id, obj);
		return ResponseEntity.ok().body(updateInstituicaoFinanceira);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		service.delete(id);
		return ResponseEntity.noContent().build();
	}


}
