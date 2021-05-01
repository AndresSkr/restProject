package com.bmind.rest.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.bmind.rest.project.service.SalaryService;

@RestController
@RequestMapping(path = "/salary")
public class SalaryRestService {
	
	@Autowired
	private SalaryService service;
	
	@GetMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
	public ResponseEntity<Double> findByDeparmentAndPosition(@RequestParam(name="deparment", required = true) String deparment, @RequestParam(name = "position") String position) {
		
		Double salary =service.findByDeparmentAndPosition(deparment, position);
		return salary != null ? ResponseEntity.ok(salary) : ResponseEntity.noContent().build();
	}	

}
