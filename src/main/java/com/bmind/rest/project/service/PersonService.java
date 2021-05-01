package com.bmind.rest.project.service;

import java.util.Optional;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bmind.rest.project.domain.PersonDTO;
import com.bmind.rest.project.entities.PersonEntity;
import com.bmind.rest.project.repository.PersonRepository;

@Service
public class PersonService {
	
	@Autowired
	private PersonRepository repository;
	
	public PersonDTO findById(Long id) {
		
		Optional<PersonEntity> persona = repository.findById(id);
		
		if (persona.isPresent()) {
			PersonDTO dto = new PersonDTO(persona.get().getId(), persona.get().getIdType(), persona.get().getIdNumber(), persona.get().getFisrt_names(), persona.get().getMiddle_name(), persona.get().getLastnames(), persona.get().getSurnames(), persona.get().getAddress(), persona.get().getPhoneNumber());
			return dto;
		}
		
		return null;
		
	}
	
	public PersonDTO findByLastnames(String lastname) {
		
		PersonEntity persona = repository.findByLastnames(lastname);
		
		if (persona != null) {
			PersonDTO dto = new PersonDTO(persona.getId(), persona.getIdType(), persona.getIdNumber(), persona.getFisrt_names(), persona.getMiddle_name(), persona.getLastnames(), persona.getSurnames(), persona.getAddress(), persona.getPhoneNumber());
			return dto;
		}
		
		return null;
		
	}
	
	public PersonDTO createPerson(PersonDTO dto) {
		
		//PersonEntity personfind=  repository.findByIdNumber(dto.getIdNumber());
		
		//if(personfind==null) {
			PersonEntity entity = new PersonEntity();
			entity.setAddress(dto.getAddress());
			entity.setFisrt_names(dto.getFisrtnames());
			//entity.setId(dto.getId());
			entity.setIdNumber(dto.getIdNumber());
			entity.setIdType(dto.getIdType());
			entity.setLastnames(dto.getLastnames());
			entity.setMiddle_name(dto.getMiddlename());
			entity.setPhoneNumber(dto.getPhoneNumber());
			entity.setSurnames(dto.getSurnames());
			entity =repository.save(entity);
			dto.setId(entity.getId());
			return dto;
		//}
		
		//return null;
	}
	
	

}
