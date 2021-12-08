package com.example.demo.SpellRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.Spells;

//El repositorio será la conexión directa con nuestra base de Datos.
public interface SpellsRepository extends JpaRepository<Spells, Integer>{

}
