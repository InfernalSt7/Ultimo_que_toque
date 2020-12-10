package com.spring.ultimoquetoque.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class User {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="username", unique=true, nullable=false, length=45)
	private String username;
	
	@Column(name="password", nullable=false, length=60)
	private String password;
	
	@Column(name="email")
	private String email;
	
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="apellidos")
	private String apellidos;
	
	@Column(name="enabled")
	private boolean enabled;
	
	@OneToMany(fetch=FetchType.EAGER, mappedBy="user")
	private Set<User_Role> user_Role = new HashSet<User_Role>();

	/**
	 * @param id
	 * @param username
	 * @param password
	 * @param email
	 * @param nombre
	 * @param apellidos
	 * @param enabled
	 * @param user_Role
	 */
	public User(int id, String username, String password, String email, String nombre, String apellidos,
			boolean enabled, Set<User_Role> user_Role) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.email = email;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.enabled = enabled;
		this.user_Role = user_Role;
	}

	/**
	 * 
	 */
	public User() {
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
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}

	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}

	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
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
	 * @return the enabled
	 */
	public boolean isEnabled() {
		return enabled;
	}

	/**
	 * @param enabled the enabled to set
	 */
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	/**
	 * @return the user_Role
	 */
	public Set<User_Role> getUser_Role() {
		return user_Role;
	}

	/**
	 * @param user_Role the user_Role to set
	 */
	public void setUser_Role(Set<User_Role> user_Role) {
		this.user_Role = user_Role;
	}

	
	
	

	
	
}