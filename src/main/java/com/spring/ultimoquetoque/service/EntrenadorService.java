package com.spring.ultimoquetoque.service;

import java.util.List;

import com.spring.ultimoquetoque.entity.Entrenador;
import com.spring.ultimoquetoque.entity.Equipo;
import com.spring.ultimoquetoque.model.EntrenadorModel;
import com.spring.ultimoquetoque.model.EquipoModel;

public interface EntrenadorService {

	public abstract List<EntrenadorModel> listEntrenadores();
	public abstract EntrenadorModel addEntrenador(EntrenadorModel entrenadorModel);
	public abstract int removeEntrenador(int id);
	public abstract EntrenadorModel updateEntrenador(EntrenadorModel entrenadorModel);
	public abstract Entrenador transform(EntrenadorModel entrenadorModel);
	public abstract EntrenadorModel transform(Entrenador entrenador);
}
