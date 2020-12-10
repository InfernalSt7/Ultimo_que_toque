package com.spring.ultimoquetoque.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.spring.ultimoquetoque.entity.Partidos;
import com.spring.ultimoquetoque.model.PartidosModel;
import com.spring.ultimoquetoque.repository.PartidosJpaRepository;
import com.spring.ultimoquetoque.service.PartidosService;

@Service("partidosServiceImpl")
public class PartidosServiceImpl implements PartidosService{
	
	@Autowired
	@Qualifier("partidosRepository")
	private PartidosJpaRepository partidosJpaRepository;
	
	@Autowired
	private DozerBeanMapper dozer;
	
	@Override
	public List<PartidosModel> listPartidos() {
		
		List<Partidos> listaP=partidosJpaRepository.findAll();
        List<PartidosModel> listaPM=new ArrayList<>();
        listaP.forEach(a->{
            PartidosModel partidosModel=transform(a);
            listaPM.add(partidosModel);
        });

        

        return listaPM;
	}

	@Override
	public PartidosModel addPartidos(PartidosModel partidosModel) {
		Partidos partidos=transform(partidosModel);
        return transform(partidosJpaRepository.save(partidos));
	}

 
	@Override
	public PartidosModel updatePartidos(PartidosModel partidosModel) {
		Partidos partidos=transform(partidosModel);
	    return transform(partidosJpaRepository.save(partidos));
	}

	@Override
	public int removePartidos(int id) {
		partidosJpaRepository.deleteById(id);
		return 0;
	}
	
	@Override
	public Partidos transform(PartidosModel partidosModel) {
		return dozer.map(partidosModel, Partidos.class);
	}
	
	@Override
	public PartidosModel transform(Partidos partidos) {
		return dozer.map(partidos, PartidosModel.class);
	}
	
}
