package com.bmind.rest.project.repository;

import org.springframework.data.repository.CrudRepository;

import com.bmind.rest.project.entities.PersonEntity;

public interface PersonRepository extends CrudRepository<PersonEntity, Long> {
	
	public PersonEntity findByLastnames(String lastname);
	
	public PersonEntity findByIdNumber(String idNumber);

}
