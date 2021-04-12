package com.doate.crudrest.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.doate.crudrest.commons.GenericServiceImpl;
import com.doate.crudrest.dao.PersonaDAO;
import com.doate.crudrest.model.Persona;
import com.doate.crudrest.service.PersonaService;

@Service
public class PersonaServiceImpl extends GenericServiceImpl<Persona, Long> implements PersonaService {

	@Autowired(required = true)
	private PersonaDAO personaDAO;

	@Override
	public CrudRepository<Persona, Long> getDao() {
		return personaDAO;
	}

}