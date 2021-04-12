package com.doate.crudrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.doate.crudrest.model.Persona;
import com.doate.crudrest.service.PersonaService;

@RestController
@RequestMapping("personas")
@CrossOrigin("*")
public class PersonaRestController {

	@Autowired
	private PersonaService personaServiceAPI;

	@GetMapping(value = "/listar")
	public List<Persona> getAll() {
		return personaServiceAPI.getAll();
	}

	@GetMapping("/listar/{id}")
	public Persona find(@PathVariable Long id) {
		return personaServiceAPI.get(id);
	}

	@PostMapping("/guardar")
	public ResponseEntity<Persona> save(@RequestBody Persona persona) {
		Persona obj = personaServiceAPI.save(persona);
		return new ResponseEntity<Persona>(obj, HttpStatus.OK);
	}

	
	@DeleteMapping("/eliminar/{id}")
	public void eliminar(@PathVariable("id") Long id) {
		personaServiceAPI.delete(id);
	}
	
	@PutMapping("/actualizar")
	public void actualizar(@RequestBody Persona persona) {
		personaServiceAPI.save(persona);
	}

}