package com.spring.ultimoquetoque.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.ultimoquetoque.entity.Equipo;

@Repository("equipoRepository")
public interface EquipoJpaRepository extends JpaRepository<Equipo, Serializable>{
	
	public abstract Equipo findById(int id);

}
