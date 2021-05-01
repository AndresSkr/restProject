package com.bmind.rest.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bmind.rest.project.domain.EmployeeDTO;
import com.bmind.rest.project.entities.EmployeeEntity;
import com.bmind.rest.project.repository.EmployeeRepository;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repository;
	
	public EmployeeDTO saveEmployee(EmployeeDTO dto) {
		
		EmployeeEntity entity = new EmployeeEntity();
		
		entity.setAddress(dto.getAddress());
		entity.setDeparment(dto.getDeparment());
		entity.setId(dto.getId());
		entity.setIdNumber(dto.getIdNumber());
		entity.setIdType(dto.getIdType());
		entity.setLastNames(dto.getLastNames());
		entity.setNames(dto.getNames());
		entity.setPhoneNumber(dto.getPhoneNumber());
		entity.setPosition(dto.getPosition());
		entity.setSalary(dto.getSalary());
		
		entity = repository.save(entity);
		
		dto.setId(entity.getId());
		
		return dto;
		
	}
	
	
	

}
