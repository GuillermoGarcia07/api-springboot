package com.example.apipersonas.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.apipersonas.entity.persona;
import com.example.apipersonas.service.personaService;

@RestController
@RequestMapping(path = "api/personas")

public class personaController {
	@Autowired
	private personaService personaServ;
	
	@GetMapping
	public List <persona> obtenerPersonas(){
		return personaServ.obtenerPersonas();
	}
	
	@GetMapping("/{id}")
	public Optional<persona> buscarPersonas(@PathVariable("id") Long id){
		return personaServ.buscarPersona(id);
	}
	
	
	@PostMapping
	public void guardarPersona(@RequestBody persona p){
		personaServ.guardarPersona(p);
	}
	
	@PutMapping()
	public void editarPersona(@RequestBody persona p){
		personaServ.editarPersona(p);
	}
	
	@DeleteMapping({"/{id}"})
	public void eliminarPersona(@PathVariable("id") Long id){
		personaServ.eliminarPersona(id);
	}

}
