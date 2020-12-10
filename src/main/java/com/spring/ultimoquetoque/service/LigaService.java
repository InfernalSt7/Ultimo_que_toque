package com.spring.ultimoquetoque.service;

import java.util.List;

import com.spring.ultimoquetoque.entity.Liga;
import com.spring.ultimoquetoque.model.LigaModel;

public interface LigaService {

	public abstract List<LigaModel> listLigas();
	public abstract Liga addLiga(LigaModel ligaModel);
	public abstract int removeLiga(int id);
	public abstract Liga updateLiga(LigaModel ligaModel);
	
}
