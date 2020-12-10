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
@Table(name="liga")
public class Liga {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_Liga")
	private int id_liga;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="pais")
	private String pais;
	
	@Column(name="fecha_creacion")
	private String fecha_creacion;
	
	@Column(name="presidente")
	private String presidente;
	
	@OneToMany(fetch=FetchType.EAGER, mappedBy="id")
	private Set<Equipo> equipo;

	/**
	 * @param id_liga
	 * @param nombre
	 * @param pais
	 * @param fecha_creacion
	 * @param presidente
	 * @param equipo
	 */
	public Liga(int id_liga, String nombre, String pais, String fecha_creacion, String presidente, Set<Equipo> equipo) {
		super();
		this.id_liga = id_liga;
		this.nombre = nombre;
		this.pais = pais;
		this.fecha_creacion = fecha_creacion;
		this.presidente = presidente;
		this.equipo = equipo;
	}

	/**
	 * 
	 */
	public Liga() {
		super();
	}

	/**
	 * @return the id_liga
	 */
	public int getId_liga() {
		return id_liga;
	}

	/**
	 * @param id_liga the id_liga to set
	 */
	public void setId_liga(int id_liga) {
		this.id_liga = id_liga;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the pais
	 */
	public String getPais() {
		return pais;
	}

	/**
	 * @param pais the pais to set
	 */
	public void setPais(String pais) {
		this.pais = pais;
	}

	/**
	 * @return the fecha_creacion
	 */
	public String getFecha_creacion() {
		return fecha_creacion;
	}

	/**
	 * @param fecha_creacion the fecha_creacion to set
	 */
	public void setFecha_creacion(String fecha_creacion) {
		this.fecha_creacion = fecha_creacion;
	}

	/**
	 * @return the presidente
	 */
	public String getPresidente() {
		return presidente;
	}

	/**
	 * @param presidente the presidente to set
	 */
	public void setPresidente(String presidente) {
		this.presidente = presidente;
	}

	/**
	 * @return the equipo
	 */
	public Set<Equipo> getEquipo() {
		return equipo;
	}

	/**
	 * @param equipo the equipo to set
	 */
	public void setEquipo(Set<Equipo> equipo) {
		this.equipo = equipo;
	}

	
	

	
	
	
	
	
}
