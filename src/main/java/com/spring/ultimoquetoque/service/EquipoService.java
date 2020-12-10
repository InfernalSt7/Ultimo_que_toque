package com.spring.ultimoquetoque.service;

import java.util.List;

import com.spring.ultimoquetoque.entity.Equipo;
import com.spring.ultimoquetoque.model.EquipoModel;

public interface EquipoService {

	public abstract List<EquipoModel> listEquipos();
	public abstract EquipoModel addEquipo(EquipoModel equipoModel);
	public abstract int removeEquipo(int id);
	public abstract EquipoModel filtrarEquipo(int id);
	public abstract EquipoModel updateEquipo(EquipoModel equipoModel);
	public abstract EquipoModel detailequipo(int id);
	public abstract Equipo transform(EquipoModel equipoModel);
	public abstract EquipoModel transform(Equipo equipo);
}
