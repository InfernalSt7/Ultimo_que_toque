package com.spring.ultimoquetoque.model;

import java.util.Set;

public class EquipoModel {

	private int id;
	private String nombre;
	private String foto;
	private float presupuesto;
	private String presidente;
	private String estadio;
	private int titulos;
	private LigaModel id_liga;
	private EntrenadorModel entrenador;
	private Set<JuegaModel> equipo_local;
	private Set<JuegaModel> equipo_visitante;
	/**
	 * @param id
	 * @param nombre
	 * @param foto
	 * @param presupuesto
	 * @param presidente
	 * @param estadio
	 * @param titulos
	 * @param id_liga
	 * @param entrenador
	 * @param equipo_local
	 * @param equipo_visitante
	 */
	public EquipoModel(int id, String nombre, String foto, float presupuesto, String presidente, String estadio,
			int titulos, LigaModel id_liga, EntrenadorModel entrenador, Set<JuegaModel> equipo_local,
			Set<JuegaModel> equipo_visitante) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.foto = foto;
		this.presupuesto = presupuesto;
		this.presidente = presidente;
		this.estadio = estadio;
		this.titulos = titulos;
		this.id_liga = id_liga;
		this.entrenador = entrenador;
		this.equipo_local = equipo_local;
		this.equipo_visitante = equipo_visitante;
	}
	/**
	 * 
	 */
	public EquipoModel() {
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
	 * @return the id_liga
	 */
	public LigaModel getId_liga() {
		return id_liga;
	}
	/**
	 * @param id_liga the id_liga to set
	 */
	public void setId_liga(LigaModel id_liga) {
		this.id_liga = id_liga;
	}
	/**
	 * @return the entrenador
	 */
	public EntrenadorModel getEntrenador() {
		return entrenador;
	}
	/**
	 * @param entrenador the entrenador to set
	 */
	public void setEntrenador(EntrenadorModel entrenador) {
		this.entrenador = entrenador;
	}
	/**
	 * @return the equipo_local
	 */
	public Set<JuegaModel> getEquipo_local() {
		return equipo_local;
	}
	/**
	 * @param equipo_local the equipo_local to set
	 */
	public void setEquipo_local(Set<JuegaModel> equipo_local) {
		this.equipo_local = equipo_local;
	}
	/**
	 * @return the equipo_visitante
	 */
	public Set<JuegaModel> getEquipo_visitante() {
		return equipo_visitante;
	}
	/**
	 * @param equipo_visitante the equipo_visitante to set
	 */
	public void setEquipo_visitante(Set<JuegaModel> equipo_visitante) {
		this.equipo_visitante = equipo_visitante;
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
