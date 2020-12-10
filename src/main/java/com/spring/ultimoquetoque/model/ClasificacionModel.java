package com.spring.ultimoquetoque.model;

import com.spring.ultimoquetoque.entity.Equipo;

public class ClasificacionModel {

	private int id;
	private String puesto;
	private int puntos;
	private int pj;
	private int pg;
	private int pe;
	private int pp;
	private int gf;
	private int gc;
	private EquipoModel equipo;
	
	
	
	public ClasificacionModel(String puesto, int puntos, int pj, int pg, int pe, int pp, int gf, int gc,
			EquipoModel equipo) {
		super();
		this.puesto = puesto;
		this.puntos = puntos;
		this.pj = pj;
		this.pg = pg;
		this.pe = pe;
		this.pp = pp;
		this.gf = gf;
		this.gc = gc;
		this.equipo = equipo;
	}

	public ClasificacionModel(int id, String puesto, int puntos, int pj, int pg, int pe, int pp, int gf, int gc,
			EquipoModel equipo) {
		super();
		this.id = id;
		this.puesto = puesto;
		this.puntos = puntos;
		this.pj = pj;
		this.pg = pg;
		this.pe = pe;
		this.pp = pp;
		this.gf = gf;
		this.gc = gc;
		this.equipo = equipo;
	}

	public ClasificacionModel() {
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
	 * @return the puesto
	 */
	public String getPuesto() {
		return puesto;
	}

	/**
	 * @param puesto the puesto to set
	 */
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}

	/**
	 * @return the puntos
	 */
	public int getPuntos() {
		return puntos;
	}

	/**
	 * @param puntos the puntos to set
	 */
	public void setPuntos(int puntos) {
		this.puntos = puntos;
	}

	/**
	 * @return the pj
	 */
	public int getPj() {
		return pj;
	}

	/**
	 * @param pj the pj to set
	 */
	public void setPj(int pj) {
		this.pj = pj;
	}

	/**
	 * @return the pg
	 */
	public int getPg() {
		return pg;
	}

	/**
	 * @param pg the pg to set
	 */
	public void setPg(int pg) {
		this.pg = pg;
	}

	/**
	 * @return the pe
	 */
	public int getPe() {
		return pe;
	}

	/**
	 * @param pe the pe to set
	 */
	public void setPe(int pe) {
		this.pe = pe;
	}

	/**
	 * @return the pp
	 */
	public int getPp() {
		return pp;
	}

	/**
	 * @param pp the pp to set
	 */
	public void setPp(int pp) {
		this.pp = pp;
	}

	/**
	 * @return the gf
	 */
	public int getGf() {
		return gf;
	}

	/**
	 * @param gf the gf to set
	 */
	public void setGf(int gf) {
		this.gf = gf;
	}

	/**
	 * @return the gc
	 */
	public int getGc() {
		return gc;
	}

	/**
	 * @param gc the gc to set
	 */
	public void setGc(int gc) {
		this.gc = gc;
	}

	/**
	 * @return the equipo
	 */
	public EquipoModel getEquipo() {
		return equipo;
	}

	/**
	 * @param equipo the equipo to set
	 */
	public void setEquipo(EquipoModel equipo) {
		this.equipo = equipo;
	}
	
	
	
	
	
	
	
	
}
