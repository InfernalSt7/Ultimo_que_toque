package com.spring.ultimoquetoque.converter;

import org.springframework.stereotype.Component;

import com.spring.ultimoquetoque.entity.Liga;
import com.spring.ultimoquetoque.model.LigaModel;

@Component("ligaConverter")
public class LigaConverter {

	//Entity --> Model
		public LigaModel entity2model(Liga liga) {
			LigaModel ligaModel=new LigaModel();
			ligaModel.setId_liga(liga.getId_liga());
			ligaModel.setNombre(liga.getNombre());
			ligaModel.setFecha_creacion(liga.getFecha_creacion());
			ligaModel.setPais(liga.getPais());
			ligaModel.setPresidente(liga.getPresidente());
			return ligaModel;
		}
		
		public Liga model2entity(LigaModel ligaModel) {
			Liga liga=new Liga();
			liga.setId_liga(ligaModel.getId_liga());
			liga.setNombre(ligaModel.getNombre());
			liga.setFecha_creacion(ligaModel.getFecha_creacion());
			liga.setPais(ligaModel.getPais());
			liga.setPresidente(ligaModel.getPresidente());
			return liga;
		}
	
}
