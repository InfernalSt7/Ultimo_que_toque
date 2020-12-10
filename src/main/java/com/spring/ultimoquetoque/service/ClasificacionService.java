package com.spring.ultimoquetoque.service;

import java.util.List;

import com.spring.ultimoquetoque.entity.Clasificacion;
import com.spring.ultimoquetoque.model.ClasificacionModel;

public interface ClasificacionService {

	public abstract List<ClasificacionModel> listClasificacion();
	public abstract ClasificacionModel addClasificacion(ClasificacionModel clasificacionModel);
	public abstract int removeClasificacion(int id);
	public abstract ClasificacionModel updateClasificacion(ClasificacionModel clasificacionModel);
	public abstract Clasificacion transform(ClasificacionModel clasificacionModel);
	public abstract ClasificacionModel transform(Clasificacion clasificacion);
}
