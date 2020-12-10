package com.spring.ultimoquetoque.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name="clasificacion")
public class Clasificacion {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	
	@Column(name="puesto")
	private String puesto;
	
	@Column(name="puntos")
	private int puntos;
	
	@Column(name="pj")
	private int pj;
	
	@Column(name="pg")
	private int pg;
	
	@Column(name="pe")
	private int pe;
	
	@Column(name="pp")
	private int pp;
	
	@Column(name="gf")
	private int gf;
	
	@Column(name="gc")
	private int gc;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name="ID_equipo")
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Equipo equipo;

	/**
	 * @param id
	 * @param puesto
	 * @param puntos
	 * @param pj
	 * @param pg
	 * @param pe
	 * @param pp
	 * @param gf
	 * @param gc
	 * @param equipo
	 */
	public Clasificacion(int id, String puesto, int puntos, int pj, int pg, int pe, int pp, int gf, int gc,
			Equipo equipo) {
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

	/**
	 * 
	 */
	public Clasificacion() {
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
	public Equipo getEquipo() {
		return equipo;
	}

	/**
	 * @param equipo the equipo to set
	 */
	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	
	
	

	
	
	
}
