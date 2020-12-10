package com.spring.ultimoquetoque.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.ultimoquetoque.entity.Entrenador;

@Repository("entrenadorRepository")
public interface EntrenadorJpaRepository extends JpaRepository<Entrenador, Serializable>{
	
	public abstract Entrenador findById(int id);

}
