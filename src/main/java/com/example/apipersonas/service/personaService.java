package com.example.apipersonas.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.apipersonas.repository.personaRepository;
import com.example.apipersonas.entity.persona;


@Service
public class personaService {
	@Autowired
	personaRepository personaR;
	
	public List<persona> obtenerPersonas(){
		return personaR.findAll();
	}
	
	public Optional<persona> buscarPersona(Long id){
		return personaR.findById(id);
	}
	
	public void guardarPersona(persona p) {
		personaR.save(p);
	}
	
	public void editarPersona(persona p) {
		personaR.save(p);
	}
	
	public void eliminarPersona(Long id) {
		personaR.deleteById(id);
	}
}
