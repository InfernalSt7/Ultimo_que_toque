package com.spring.ultimoquetoque.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.ultimoquetoque.entity.Clasificacion;

@Repository("clasificacionRepository")
public interface ClasificacionJpaRepository extends JpaRepository<Clasificacion, Serializable>{
	
public abstract Clasificacion findById(int id);

}
