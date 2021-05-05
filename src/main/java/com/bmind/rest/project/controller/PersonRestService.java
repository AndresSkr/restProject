package com.bmind.rest.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.ResponseEntity.HeadersBuilder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bmind.rest.project.domain.PersonDTO;
import com.bmind.rest.project.service.PersonService;

@RestController
@RequestMapping(path = "/person")
public class PersonRestService {
	
	@Autowired
	private PersonService service;
	
	@GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<PersonDTO> findById(@RequestParam(name="id", required = true) Long id) {
		PersonDTO dto = service.findById(id);
		return dto != null ?  ResponseEntity.ok(dto): ResponseEntity.noContent().build();
	}
	
	@GetMapping(value="/findByLastnames", produces = {MediaType.APPLICATION_JSON_VALUE})
	public PersonDTO findByLastnames(@RequestParam(name="lastname", required = true) String lastname) {
		return service.findByLastnames(lastname);
	}
	
	@PostMapping("/create")
	public ResponseEntity<PersonDTO>createPerson(@RequestBody() PersonDTO dto) {
		PersonDTO dtoResponse = service.createPerson(dto);
		//return dtoResponse != null ? ResponseEntity.ok(dtoResponse) : ResponseEntity.noContent().build();
		return dtoResponse != null ? ResponseEntity.ok(dtoResponse) : ResponseEntity.status(HttpStatus.CONFLICT).build();
		
	}

}
