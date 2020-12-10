package com.spring.ultimoquetoque.service;

import java.util.List;

import com.spring.ultimoquetoque.entity.Partidos;
import com.spring.ultimoquetoque.model.PartidosModel;

public interface PartidosService {
	
	public abstract List<PartidosModel> listPartidos();
	public abstract PartidosModel addPartidos(PartidosModel PartidoModel);
	public abstract int removePartidos(int id);
	public abstract PartidosModel updatePartidos(PartidosModel PartidoModel);
	public abstract Partidos transform(PartidosModel partidosModel);
	public abstract PartidosModel transform(Partidos partidos);
	
	
}
