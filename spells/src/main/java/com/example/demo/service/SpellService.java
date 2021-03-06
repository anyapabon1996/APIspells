package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.SpellRepository.SpellsRepository;
import com.example.demo.model.Spells;

import java.util.List;

//Beans de tipo service
@Service
public class SpellService {
	
	//Atributo
	private final SpellsRepository spellRepository; 

	//Constructor que funge como conector entre capas con repository
	@Autowired
	public SpellService(SpellsRepository spellRepository) {
		this.spellRepository = spellRepository;
	}
	
	//Este método devuelve todos los items que hay en la tabla
	public List<Spells> getSpells(){
		return spellRepository.findAll();
	}
	
	//Busca un hechizo especifico
	public Spells getSpellByID(Integer id){
		return spellRepository.findById(id).orElseThrow(() -> new RuntimeException("This id's spell doesn't exist!"));
	}
	
	
	//elimina un hechizo particular
	public void deleteSpell(Integer spellToDelete) {
		spellRepository.deleteById(spellToDelete);
	}
	
	//Actualiza un hechizo
	public Spells updateSpell(Spells spellToUpdate) {
		return spellRepository.save(spellToUpdate);
	}
	
	//Crea un nuevo hechizo en la tabla
	public Spells createSpell(Spells spellToCreate) {
		return spellRepository.save(spellToCreate);
	}
}
