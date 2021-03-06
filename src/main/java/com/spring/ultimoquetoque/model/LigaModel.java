package com.spring.ultimoquetoque.model;


public class LigaModel {

	private int id_liga;
	private String nombre;
	private String pais;
	private String fecha_creacion;
	private String presidente;
	/**
	 * @param id_liga
	 * @param nombre
	 * @param pais
	 * @param fecha_creacion
	 * @param presidente
	 */
	public LigaModel(int id_liga, String nombre, String pais, String fecha_creacion, String presidente) {
		super();
		this.id_liga = id_liga;
		this.nombre = nombre;
		this.pais = pais;
		this.fecha_creacion = fecha_creacion;
		this.presidente = presidente;
	}
	/**
	 * 
	 */
	public LigaModel() {
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
	
	
	
	
	
	
}
