package com.spring.ultimoquetoque.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.spring.ultimoquetoque.entity.Entrenador;
import com.spring.ultimoquetoque.model.EntrenadorModel;
import com.spring.ultimoquetoque.repository.EntrenadorJpaRepository;
import com.spring.ultimoquetoque.service.EntrenadorService;

@Service("entrenadorServiceImpl")
public class EntrenadorServiceImpl implements EntrenadorService{

	private static final Log LOG=LogFactory.getLog(EntrenadorServiceImpl.class);
	
	@Autowired
	@Qualifier("entrenadorRepository")
	private EntrenadorJpaRepository entrenadorJpaRepository;
	
	@Autowired
	private DozerBeanMapper dozer;
	
	@Override
	public List<EntrenadorModel> listEntrenadores() {
		
		List<Entrenador> listaE=entrenadorJpaRepository.findAll();
        List<EntrenadorModel> listaEM=new ArrayList<>();
        listaE.forEach(a->{
        	EntrenadorModel entrenadorModel=transform(a);
            listaEM.add(entrenadorModel);
        });

       // Collections.sort(listaEM, (EquipoModel e1, EquipoModel e2) -> e1.getNombre().compareTo(e2.getNombre()));

        return listaEM;
	}

	@Override
	public EntrenadorModel addEntrenador(EntrenadorModel entrenadorModel) {
		Entrenador entrenador=transform(entrenadorModel);
	    return transform(entrenadorJpaRepository.save(entrenador));
	}

 
	@Override
	public EntrenadorModel updateEntrenador(int id) {	
        Entrenador entrenador= entrenadorJpaRepository.findById(id);
	    return transform(entrenadorJpaRepository.save(entrenador));
	}

	@Override
	public int removeEntrenador(int id) {
		entrenadorJpaRepository.deleteById(id);
		return 0;
	}
	
	@Override
	public Entrenador transform(EntrenadorModel entrenadorModel) {
		return dozer.map(entrenadorModel, Entrenador.class);
	}
	
	@Override
	public EntrenadorModel transform(Entrenador entrenador) {
		return dozer.map(entrenador, EntrenadorModel.class);
	}
	
}
