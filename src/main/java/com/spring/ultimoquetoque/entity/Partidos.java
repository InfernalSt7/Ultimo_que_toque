package com.spring.ultimoquetoque.entity;

import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="partidos")
public class Partidos {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_Partido")
	private int id;
	
	@Column(name="fecha")
	private String fecha;
	
	@OneToMany(fetch=FetchType.EAGER, mappedBy="fk_partido")
	private Set<Juega> juega;

	/**
	 * @param id
	 * @param fecha
	 * @param juega
	 */
	public Partidos(int id, String fecha, Set<Juega> juega) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.juega = juega;
	}

	/**
	 * 
	 */
	public Partidos() {
		super();
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the fecha
	 */
	public String getFecha() {
		return fecha;
	}

	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	/**
	 * @return the juega
	 */
	public Set<Juega> getJuega() {
		return juega;
	}

	/**
	 * @param juega the juega to set
	 */
	public void setJuega(Set<Juega> juega) {
		this.juega = juega;
	}

	

	

	

	
	
	
}
