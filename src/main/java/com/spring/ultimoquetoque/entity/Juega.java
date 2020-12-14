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

@Entity
@Table(name="juega")
public class Juega {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;

	@Column(name="resultado")
	private String resultado;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "equipo_local")
	private Equipo equipo_local;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name = "equipo_visitante")
	private Equipo equipo_visitante;
	
	@ManyToOne(cascade = CascadeType.MERGE)
	@JoinColumn(name="ID_Partido")
	private Partidos fk_partido;

	/**
	 * @param id
	 * @param resultado
	 * @param equipo_local
	 * @param equipo_visitante
	 * @param fk_partido
	 */
	public Juega(int id, String resultado, Equipo equipo_local, Equipo equipo_visitante, Partidos fk_partido) {
		super();
		this.id = id;
		this.resultado = resultado;
		this.equipo_local = equipo_local;
		this.equipo_visitante = equipo_visitante;
		this.fk_partido = fk_partido;
	}

	/**
	 * 
	 */
	public Juega() {
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
	 * @return the resultado
	 */
	public String getResultado() {
		return resultado;
	}

	/**
	 * @param resultado the resultado to set
	 */
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}

	/**
	 * @return the equipo_local
	 */
	public Equipo getEquipo_local() {
		return equipo_local;
	}

	/**
	 * @param equipo_local the equipo_local to set
	 */
	public void setEquipo_local(Equipo equipo_local) {
		this.equipo_local = equipo_local;
	}

	/**
	 * @return the equipo_visitante
	 */
	public Equipo getEquipo_visitante() {
		return equipo_visitante;
	}

	/**
	 * @param equipo_visitante the equipo_visitante to set
	 */
	public void setEquipo_visitante(Equipo equipo_visitante) {
		this.equipo_visitante = equipo_visitante;
	}

	/**
	 * @return the fk_partido
	 */
	public Partidos getFk_partido() {
		return fk_partido;
	}

	/**
	 * @param fk_partido the fk_partido to set
	 */
	public void setFk_partido(Partidos fk_partido) {
		this.fk_partido = fk_partido;
	}
	
	
	
	
	
	
	
}
