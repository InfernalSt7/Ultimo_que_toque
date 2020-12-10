package com.spring.ultimoquetoque.model;

import com.spring.ultimoquetoque.entity.Equipo;

public class EntrenadorModel {

	private int id;
	private String nombre;
	private String apellidos;
	private String pais;
	private String fecha_nacimiento;
	private Equipo id_Equipo;
	/**
	 * @param id
	 * @param nombre
	 * @param apellidos
	 * @param pais
	 * @param fecha_nacimiento
	 * @param id_Equipo
	 */
	public EntrenadorModel(int id, String nombre, String apellidos, String pais, String fecha_nacimiento,
			Equipo id_Equipo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.pais = pais;
		this.fecha_nacimiento = fecha_nacimiento;
		this.id_Equipo = id_Equipo;
	}
	/**
	 * 
	 */
	public EntrenadorModel() {
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
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}
	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
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
	 * @return the fecha_nacimiento
	 */
	public String getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	/**
	 * @param fecha_nacimiento the fecha_nacimiento to set
	 */
	public void setFecha_nacimiento(String fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	/**
	 * @return the id_Equipo
	 */
	public Equipo getId_Equipo() {
		return id_Equipo;
	}
	/**
	 * @param id_Equipo the id_Equipo to set
	 */
	public void setId_Equipo(Equipo id_Equipo) {
		this.id_Equipo = id_Equipo;
	}
	
	
	
	
	
}
