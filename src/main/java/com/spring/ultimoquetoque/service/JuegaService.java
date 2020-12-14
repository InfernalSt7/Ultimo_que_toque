package com.spring.ultimoquetoque.service;

import java.util.List;

import com.spring.ultimoquetoque.entity.Juega;
import com.spring.ultimoquetoque.model.JuegaModel;

public interface JuegaService {

	public abstract List<JuegaModel> listResultados();
	public abstract JuegaModel addResultados(JuegaModel juegaModel);
	public abstract int removeResultados(int id);
	public abstract JuegaModel updateResultados(JuegaModel juegaModel);
	public abstract JuegaModel detailResultados(int id);
	public abstract Juega transform(JuegaModel juegaModel);
	public abstract JuegaModel transform(Juega juega);

}
