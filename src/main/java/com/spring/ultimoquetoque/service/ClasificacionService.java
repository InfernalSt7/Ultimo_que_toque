package com.spring.ultimoquetoque.service;

import java.util.List;

import com.spring.ultimoquetoque.entity.Clasificacion;
import com.spring.ultimoquetoque.model.ClasificacionModel;
import com.spring.ultimoquetoque.model.EquipoModel;
import com.spring.ultimoquetoque.model.JuegaModel;

public interface ClasificacionService {

	public abstract List<ClasificacionModel> listClasificacion();
	public abstract ClasificacionModel addClasificacion(ClasificacionModel clasificacionModel);
	public abstract int removeClasificacion(int id);
	public abstract ClasificacionModel updateClasificacion(ClasificacionModel clasificacionModel);
	public void modificarClasificacion(JuegaModel jm);
	public abstract Clasificacion transform(ClasificacionModel clasificacionModel);
	public abstract ClasificacionModel transform(Clasificacion clasificacion);
}
