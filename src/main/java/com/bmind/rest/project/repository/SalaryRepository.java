package com.bmind.rest.project.repository;

import org.springframework.data.repository.CrudRepository;

import com.bmind.rest.project.entities.SalaryEntity;

public interface SalaryRepository extends CrudRepository<SalaryEntity, Long> {
	
	public SalaryEntity findByDeparmentAndPosition(String deparment, String position);

}
