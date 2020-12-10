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
@Table(name="jugador")
public class Jugador {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID_Jugador")
	private int id;
	
	@Column(name="foto")
	private String foto;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="apellidos")
	private String apellidos;
	
	@Column(name="pais")
	private String pais;

	@Column(name="fecha_nacimiento")
	private String fecha_nacimiento;
	
	@Column(name="dorsal")
	private int dorsal;
	
	@Column(name="posicion")
	private String posicion;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="ID_Equipo")
	@OnDelete(action = OnDeleteAction.CASCADE)
	private Equipo id_equipo;

	/**
	 * @param id
	 * @param foto
	 * @param nombre
	 * @param apellidos
	 * @param pais
	 * @param fecha_nacimiento
	 * @param dorsal
	 * @param posicion
	 * @param id_equipo
	 */
	public Jugador(int id, String foto, String nombre, String apellidos, String pais, String fecha_nacimiento,
			int dorsal, String posicion, Equipo id_equipo) {
		super();
		this.id = id;
		this.foto = foto;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.pais = pais;
		this.fecha_nacimiento = fecha_nacimiento;
		this.dorsal = dorsal;
		this.posicion = posicion;
		this.id_equipo = id_equipo;
	}

	/**
	 * 
	 */
	public Jugador() {
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
	 * @return the id_equipo
	 */
	public Equipo getId_equipo() {
		return id_equipo;
	}

	/**
	 * @param id_equipo the id_equipo to set
	 */
	public void setId_equipo(Equipo id_equipo) {
		this.id_equipo = id_equipo;
	}

	

	
	
	
}
