package com.spring.ultimoquetoque.service;

import java.util.List;

import com.spring.ultimoquetoque.entity.Jugador;
import com.spring.ultimoquetoque.model.EquipoModel;
import com.spring.ultimoquetoque.model.JugadorModel;

public interface JugadorService {

	public abstract List<JugadorModel> listJugadores();
	public abstract JugadorModel addJugador(JugadorModel jugadorModel);
	public abstract int removeJugador(int id);
	public abstract JugadorModel updateJugador(JugadorModel jugadorModel);
	public abstract List<JugadorModel> detailjugador(int id);
	public abstract Jugador transform(JugadorModel jugadorModel);
	public abstract JugadorModel transform(Jugador jugador);
	/*public abstract List<JugadorModel> listJugadores();
	public abstract Jugador addJugador(JugadorModel jugadorModel);
	public abstract int removeJugador(int id);
	public abstract Jugador updateJugador(JugadorModel jugadorModel);*/
	
}
