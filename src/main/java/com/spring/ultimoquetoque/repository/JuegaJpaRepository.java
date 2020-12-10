package com.spring.ultimoquetoque.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.ultimoquetoque.entity.Juega;

@Repository("juegaRepository")
public interface JuegaJpaRepository extends JpaRepository<Juega, Serializable>{
	
public abstract Juega findById(int id);

}
