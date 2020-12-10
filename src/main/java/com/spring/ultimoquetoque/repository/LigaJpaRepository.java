package com.spring.ultimoquetoque.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.ultimoquetoque.entity.Liga;

@Repository("ligaRepository")
public interface LigaJpaRepository extends JpaRepository<Liga, Serializable>{
	
	

}
