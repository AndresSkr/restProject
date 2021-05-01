package com.bmind.rest.project.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TBL_SALARY")
public class SalaryEntity {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)	
	private Long id;
	
	@Column(name="POSITION")
	private String position;
	
	@Column(name="DEPARMENT")
	private String deparment;
	
	@Column(name="SALARY")
	private Double salary;
	
	public SalaryEntity() {
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getDeparment() {
		return deparment;
	}

	public void setDeparment(String deparment) {
		this.deparment = deparment;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}	
	

}
