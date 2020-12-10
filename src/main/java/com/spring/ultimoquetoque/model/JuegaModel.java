package com.spring.ultimoquetoque.model;

public class JuegaModel {

	private int id;
	private String resultado;
	private EquipoModel equipo_local;
	private EquipoModel equipo_visitante;
	private PartidosModel fk_partido;
	/**
	 * @param id
	 * @param resultado
	 * @param equipo_local
	 * @param equipo_visitante
	 * @param fk_partido
	 */
	public JuegaModel(int id, String resultado, EquipoModel equipo_local, EquipoModel equipo_visitante,
			PartidosModel fk_partido) {
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
	public JuegaModel() {
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
	public EquipoModel getEquipo_local() {
		return equipo_local;
	}
	/**
	 * @param equipo_local the equipo_local to set
	 */
	public void setEquipo_local(EquipoModel equipo_local) {
		this.equipo_local = equipo_local;
	}
	/**
	 * @return the equipo_visitante
	 */
	public EquipoModel getEquipo_visitante() {
		return equipo_visitante;
	}
	/**
	 * @param equipo_visitante the equipo_visitante to set
	 */
	public void setEquipo_visitante(EquipoModel equipo_visitante) {
		this.equipo_visitante = equipo_visitante;
	}
	/**
	 * @return the fk_partido
	 */
	public PartidosModel getFk_partido() {
		return fk_partido;
	}
	/**
	 * @param fk_partido the fk_partido to set
	 */
	public void setFk_partido(PartidosModel fk_partido) {
		this.fk_partido = fk_partido;
	}
	
	
	
	
	
	
	
}
