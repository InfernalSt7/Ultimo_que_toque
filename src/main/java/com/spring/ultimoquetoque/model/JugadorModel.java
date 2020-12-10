package com.spring.ultimoquetoque.model;

import com.spring.ultimoquetoque.entity.Equipo;

public class JugadorModel {

	private int id;
	private String foto;
	private String nombre;
	private String apellidos;
	private String pais;
	private String fecha_nacimiento;
	private int dorsal;
	private String posicion;
	private EquipoModel id_Equipo;
	/**
	 * @param id
	 * @param foto
	 * @param nombre
	 * @param apellidos
	 * @param pais
	 * @param fecha_nacimiento
	 * @param dorsal
	 * @param posicion
	 * @param id_Equipo
	 */
	public JugadorModel(int id, String foto, String nombre, String apellidos, String pais, String fecha_nacimiento,
			int dorsal, String posicion, EquipoModel id_Equipo) {
		super();
		this.id = id;
		this.foto = foto;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.pais = pais;
		this.fecha_nacimiento = fecha_nacimiento;
		this.dorsal = dorsal;
		this.posicion = posicion;
		this.id_Equipo = id_Equipo;
	}
	/**
	 * 
	 */
	public JugadorModel() {
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
	 * @return the foto
	 */
	public String getFoto() {
		return foto;
	}
	/**
	 * @param foto the foto to set
	 */
	public void setFoto(String foto) {
		this.foto = foto;
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
	 * @return the dorsal
	 */
	public int getDorsal() {
		return dorsal;
	}
	/**
	 * @param dorsal the dorsal to set
	 */
	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}
	/**
	 * @return the posicion
	 */
	public String getPosicion() {
		return posicion;
	} 	
	/**
	 * @param posicion the posicion to set
	 */
	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	/**
	 * @return the id_Equipo
	 */
	public EquipoModel getId_Equipo() {
		return id_Equipo;
	}
	/**
	 * @param id_Equipo the id_Equipo to set
	 */
	public void setId_Equipo(EquipoModel id_Equipo) {
		this.id_Equipo = id_Equipo;
	}
	
		
	
	
	
}