package com.bmind.rest.project.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bmind.rest.project.entities.HomologationEntity;
import com.bmind.rest.project.repository.HomologationRepository;

@Service
public class HomologationService {
	
	@Autowired
	private HomologationRepository repositoryHomologation;
	
	public String getCC(int id) {
		Optional<HomologationEntity> homologation = repositoryHomologation.findById(id);
		return homologation.get().getType();
	}

}
