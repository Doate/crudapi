package com.doate.crudrest.dao;

import org.springframework.data.repository.CrudRepository;
import com.doate.crudrest.model.Persona;

public interface PersonaDAO extends CrudRepository<Persona, Long> {

}
