package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//Entidad que sera parte de una tabla en nuestra BB.DD
@Entity
public class Spells implements Serializable {

	//Atributes
	//Los siguientes 3 @ indican que el campo Id será el mismo que el de la BB.DD, se autoincrementa solo de a 1, y es requerido e inmodificable
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(nullable = false, updatable = false)
	private Integer id; 
	private String name; 
	private Spelltype type; 
	private MinisterQualification legal;
	private boolean teachable; 
	private Integer ageLearning; 
	
	//Constructo Vacio
	public Spells() {
		
	}

	//Constructor con todos los campos.
	public Spells(Integer id, String name, Spelltype type, MinisterQualification legal, boolean teachable,
			Integer ageLearning) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.legal = legal;
		this.teachable = teachable;
		this.ageLearning = ageLearning;
	}

	
	//GETTERS AND SETTERS
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Spelltype getType() {
		return type;
	}

	public void setType(Spelltype type) {
		this.type = type;
	}

	public MinisterQualification getLegal() {
		return legal;
	}

	public void setLegal(MinisterQualification legal) {
		this.legal = legal;
	}

	public boolean isTeachable() {
		return teachable;
	}

	public void setTeachable(boolean teachable) {
		this.teachable = teachable;
	}

	public Integer getAgeLearning() {
		return ageLearning;
	}

	public void setAgeLearning(Integer ageLearning) {
		this.ageLearning = ageLearning;
	}

	
	//Metodo ToString
	@Override
	public String toString() {
		return "Spells [id=" + id + ", name=" + name + ", type=" + type + ", legal=" + legal + ", teachable="
				+ teachable + ", ageLearning=" + ageLearning + "]";
	}

}
