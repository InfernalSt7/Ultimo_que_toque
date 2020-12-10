package com.spring.ultimoquetoque.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

@Entity
@Table(name="equipo")
public class Equipo {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_equipo")
	private int id;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="foto")
	private String foto;
	
	@Column(name="presupuesto")
	private float presupuesto;
	
	@Column(name="presidente")
	private String presidente;
	
	@Column(name="estadio")
	private String estadio;
	
	@Column(name="titulos")
	private int titulos;
	
	@OneToOne
	@JoinColumn(name="entrenador")
	private Entrenador entrenador;
	
	@ManyToOne
	@JoinColumn(name="id_liga")
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Liga id_liga;
	
	@OneToMany(fetch=FetchType.EAGER, mappedBy="equipo_local")
	private Set<Juega> equipo_local;
	
	@OneToMany(fetch=FetchType.EAGER, mappedBy="equipo_visitante")
	private Set<Juega> equipo_visitante;

	/**
	 * @param id
	 * @param nombre
	 * @param foto
	 * @param presupuesto
	 * @param presidente
	 * @param estadio
	 * @param titulos
	 * @param entrenador
	 * @param id_liga
	 * @param equipo_local
	 * @param equipo_visitante
	 */
	public Equipo(int id, String nombre, String foto, float presupuesto, String presidente, String estadio, int titulos,
			Entrenador entrenador, Liga id_liga, Set<Juega> equipo_local, Set<Juega> equipo_visitante) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.foto = foto;
		this.presupuesto = presupuesto;
		this.presidente = presidente;
		this.estadio = estadio;
		this.titulos = titulos;
		this.entrenador = entrenador;
		this.id_liga = id_liga;
		this.equipo_local = equipo_local;
		this.equipo_visitante = equipo_visitante;
	}

	/**
	 * 
	 */
	public Equipo() {
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
	 * @return the presupuesto
	 */
	public float getPresupuesto() {
		return presupuesto;
	}

	/**
	 * @param presupuesto the presupuesto to set
	 */
	public void setPresupuesto(float presupuesto) {
		this.presupuesto = presupuesto;
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
	 * @return the estadio
	 */
	public String getEstadio() {
		return estadio;
	}

	/**
	 * @param estadio the estadio to set
	 */
	public void setEstadio(String estadio) {
		this.estadio = estadio;
	}

	/**
	 * @return the titulos
	 */
	public int getTitulos() {
		return titulos;
	}

	/**
	 * @param titulos the titulos to set
	 */
	public void setTitulos(int titulos) {
		this.titulos = titulos;
	}

	/**
	 * @return the entrenador
	 */
	public Entrenador getEntrenador() {
		return entrenador;
	}

	/**
	 * @param entrenador the entrenador to set
	 */
	public void setEntrenador(Entrenador entrenador) {
		this.entrenador = entrenador;
	}

	/**
	 * @return the id_liga
	 */
	public Liga getId_liga() {
		return id_liga;
	}

	/**
	 * @param id_liga the id_liga to set
	 */
	public void setId_liga(Liga id_liga) {
		this.id_liga = id_liga;
	}

	/**
	 * @return the equipo_local
	 */
	public Set<Juega> getEquipo_local() {
		return equipo_local;
	}

	/**
	 * @param equipo_local the equipo_local to set
	 */
	public void setEquipo_local(Set<Juega> equipo_local) {
		this.equipo_local = equipo_local;
	}

	/**
	 * @return the equipo_visitante
	 */
	public Set<Juega> getEquipo_visitante() {
		return equipo_visitante;
	}

	/**
	 * @param equipo_visitante the equipo_visitante to set
	 */
	public void setEquipo_visitante(Set<Juega> equipo_visitante) {
		this.equipo_visitante = equipo_visitante;
	}

	

	
	
	
	
	

	

	

	

	
	
	
	
	
}
