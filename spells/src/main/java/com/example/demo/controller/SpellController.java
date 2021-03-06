package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Spells;
import com.example.demo.service.SpellService;

import java.util.List;

@RequestMapping("spellAPI/v1")
@RestController
public class SpellController {
	
	//Atributo
	private final SpellService spellSerive; 
	
	//Constructor que funge como conexion con el service
	@Autowired
	public SpellController(SpellService spell) {
		this.spellSerive = spell;
	}
	
	
	//METODO READ
	@GetMapping("allSpells")
	public List<Spells> getSpells() {
		return spellSerive.getSpells();
	} 
	
	//METODO READ 
	@GetMapping("/uniqueSpell/{id}")
	public Spells getSpellsById(@PathVariable Integer id){
		return spellSerive.getSpellByID(id);
	}
	
	//METODO CREATE
	@PostMapping("/addSpell")
	public Spells createSpells(@RequestBody Spells spell) {
		return spellSerive.createSpell(spell);
	}
	
	//METODO UPDATE
	@PutMapping("/updatingSpells")
	public Spells updateSpell(@RequestBody Spells spell) {
		return spellSerive.updateSpell(spell);
	}
	
	
	//METODO DELETE 
	@DeleteMapping("/deleteSpell/{id}")
	public void deleteSpell(@PathVariable Integer id) {
		spellSerive.deleteSpell(id);
	}
}
