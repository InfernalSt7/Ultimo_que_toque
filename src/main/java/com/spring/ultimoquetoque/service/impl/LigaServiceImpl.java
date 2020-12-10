package com.spring.ultimoquetoque.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.spring.ultimoquetoque.converter.LigaConverter;
import com.spring.ultimoquetoque.entity.Liga;
import com.spring.ultimoquetoque.model.LigaModel;
import com.spring.ultimoquetoque.repository.LigaJpaRepository;
import com.spring.ultimoquetoque.service.LigaService;

@Service("ligaServiceImpl")
public class LigaServiceImpl implements LigaService{
	
	@Autowired
	@Qualifier("ligaRepository")
	private LigaJpaRepository ligaJpaRepository;
	
	@Autowired
	@Qualifier("ligaConverter")
	private LigaConverter ligaConverter;
	
	@Override
	public List<LigaModel> listLigas() {
		List<LigaModel> ligaModel=new ArrayList<LigaModel>();
		for(Liga liga: ligaJpaRepository.findAll())
			ligaModel.add(ligaConverter.entity2model(liga));
		return ligaModel;
	}

	@Override
	public Liga addLiga(LigaModel ligaModel) {
		Liga liga=ligaConverter.model2entity(ligaModel);
		return ligaJpaRepository.save(liga);
	}

 
	@Override
	public Liga updateLiga(LigaModel ligaModel) {
		Liga liga=ligaConverter.model2entity(ligaModel);
		return ligaJpaRepository.save(liga);
	}

	@Override
	public int removeLiga(int id) {
		ligaJpaRepository.deleteById(id);
		return 0;
	}
	
}
