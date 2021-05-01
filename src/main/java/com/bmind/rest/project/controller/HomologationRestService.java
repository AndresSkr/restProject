package com.bmind.rest.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bmind.rest.project.entities.HomologationEntity;
import com.bmind.rest.project.service.HomologationService;

@RestController
@RequestMapping("homologation")
public class HomologationRestService {
	
	@Autowired
	private HomologationService serviceHomologation;
	
	@GetMapping("/{id}")
	public String getCc(@PathVariable int id ) {
		
		return serviceHomologation.getCC(id);
	}

}
