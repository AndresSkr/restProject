package com.bmind.rest.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bmind.rest.project.domain.EmployeeDTO;
import com.bmind.rest.project.service.EmployeeService;

@RestController
@RequestMapping(path = "/employee")
public class EmployeeRestService {
	
	@Autowired
	private EmployeeService service;
	
	@PostMapping(value="/create", consumes =  {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
	public EmployeeDTO create(@RequestBody(required = true) EmployeeDTO dto) {
		return service.saveEmployee(dto);
	}

}
