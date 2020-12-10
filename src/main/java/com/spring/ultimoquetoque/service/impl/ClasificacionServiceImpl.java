package com.spring.ultimoquetoque.service.impl;
import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.spring.ultimoquetoque.entity.Clasificacion;
import com.spring.ultimoquetoque.model.ClasificacionModel;
import com.spring.ultimoquetoque.repository.ClasificacionJpaRepository;
import com.spring.ultimoquetoque.service.ClasificacionService;

@Service("clasificacionServiceImpl")
public class ClasificacionServiceImpl implements ClasificacionService{
	
	@Autowired
	@Qualifier("clasificacionRepository")
	private ClasificacionJpaRepository clasificacionJpaRepository;
	
	@Autowired
	private DozerBeanMapper dozer;
	
	@Override
	public List<ClasificacionModel> listClasificacion() {
		
		List<Clasificacion> listaC=clasificacionJpaRepository.findAll();
        List<ClasificacionModel> listaCM=new ArrayList<>();
        listaC.forEach(a->{
        	ClasificacionModel clasificacionModel=transform(a);
            listaCM.add(clasificacionModel);
        });

       // Collections.sort(listaEM, (EquipoModel e1, EquipoModel e2) -> e1.getNombre().compareTo(e2.getNombre()));

        return listaCM;
	}


	@Override
	public ClasificacionModel addClasificacion(ClasificacionModel clasificacionModel) {
		Clasificacion clasificacion=transform(clasificacionModel);
	    return transform(clasificacionJpaRepository.save(clasificacion));
	}


	@Override
	public int removeClasificacion(int id) {
		clasificacionJpaRepository.deleteById(id);
		return 0;
	}


	@Override
	public ClasificacionModel updateClasificacion(ClasificacionModel clasificacionModel) {
		Clasificacion clasificacion=transform(clasificacionModel);
	    return transform(clasificacionJpaRepository.save(clasificacion));
	}
	
	@Override
	public Clasificacion transform(ClasificacionModel clasificacionModel) {
		return dozer.map(clasificacionModel, Clasificacion.class);
	}
	
	@Override
	public ClasificacionModel transform(Clasificacion clasificacion) {
		return dozer.map(clasificacion, ClasificacionModel.class);
	}
}