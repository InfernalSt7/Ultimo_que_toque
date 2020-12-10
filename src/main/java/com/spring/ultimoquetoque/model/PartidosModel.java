package com.spring.ultimoquetoque.model;

import java.util.Date;
import java.util.Set;

public class PartidosModel {

	private int id;
	private String fecha;
	private Set<JuegaModel> juega;
	/**
	 * @param id
	 * @param fecha
	 * @param juega
	 */
	public PartidosModel(int id, String fecha, Set<JuegaModel> juega) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.juega = juega;
	}
	/**
	 * 
	 */
	public PartidosModel() {
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
	public Set<JuegaModel> getJuega() {
		return juega;
	}
	/**
	 * @param juega the juega to set
	 */
	public void setJuega(Set<JuegaModel> juega) {
		this.juega = juega;
	}
	
	
	
	
	
	
	
	
	
	
	
}
