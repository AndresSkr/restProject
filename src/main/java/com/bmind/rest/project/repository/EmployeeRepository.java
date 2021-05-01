package com.bmind.rest.project.repository;

import org.springframework.data.repository.CrudRepository;

import com.bmind.rest.project.entities.EmployeeEntity;

public interface EmployeeRepository extends CrudRepository<EmployeeEntity, Long> {

}
