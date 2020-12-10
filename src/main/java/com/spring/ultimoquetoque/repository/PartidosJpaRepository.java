package com.spring.ultimoquetoque.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.ultimoquetoque.entity.Partidos;

@Repository("partidosRepository")
public interface PartidosJpaRepository extends JpaRepository<Partidos, Serializable>{
	
	public abstract Partidos findById(int id);

}
