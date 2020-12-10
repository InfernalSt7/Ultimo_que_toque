package com.spring.ultimoquetoque.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.ultimoquetoque.entity.Jugador;

@Repository("jugadorRepository")
public interface JugadorJpaRepository extends JpaRepository<Jugador, Serializable>{
	
	public abstract Jugador findById(int id);

}
