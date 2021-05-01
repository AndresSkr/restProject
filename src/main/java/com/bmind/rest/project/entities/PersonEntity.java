package com.bmind.rest.project.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="TBL_PERSON")
public class PersonEntity {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private Long id;
	
	@Column(name="ID_TYPE")
	private String idType;
	
	@Column(name="ID_NUMBER")
	private String idNumber;
	
	@Column(name="NAMES")
	private String fisrt_names;
	
	@Column(name="MIDDLE_NAME")
	private String middle_name;
	
	@Column(name="LASTNAME")
	private String lastnames;
	
	@Column(name="SURNAME")
	private String surnames;
	
	@Column(name="ADDRESS")
	private String address;
	
	@Column(name="PHONE_NUMBER")
	private String phoneNumber;
	
	public PersonEntity() {
		// TODO Auto-generated constructor stub
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIdType() {
		return idType;
	}
	public void setIdType(String idType) {
		this.idType = idType;
	}
	public String getIdNumber() {
		return idNumber;
	}
	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getFisrt_names() {
		return fisrt_names;
	}

	public void setFisrt_names(String fisrt_names) {
		this.fisrt_names = fisrt_names;
	}

	public String getMiddle_name() {
		return middle_name;
	}

	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}

	public String getLastnames() {
		return lastnames;
	}

	public void setLastnames(String lastnames) {
		this.lastnames = lastnames;
	}

	public String getSurnames() {
		return surnames;
	}

	public void setSurnames(String surnames) {
		this.surnames = surnames;
	}
	
	

}
