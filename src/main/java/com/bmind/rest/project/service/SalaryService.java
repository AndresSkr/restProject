package com.bmind.rest.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bmind.rest.project.entities.SalaryEntity;
import com.bmind.rest.project.repository.SalaryRepository;

@Service
public class SalaryService {
	
	@Autowired
	private SalaryRepository repository;
	
	
	public Double findByDeparmentAndPosition(String deparment, String position) {
		SalaryEntity salary = repository.findByDeparmentAndPosition(deparment, position);
		return salary != null ? salary.getSalary() : null;
	}
	
	
	

}
