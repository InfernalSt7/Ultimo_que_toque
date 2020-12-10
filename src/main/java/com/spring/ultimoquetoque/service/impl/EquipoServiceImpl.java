package com.spring.ultimoquetoque.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.spring.ultimoquetoque.entity.Equipo;
import com.spring.ultimoquetoque.model.EquipoModel;
import com.spring.ultimoquetoque.repository.EquipoJpaRepository;
import com.spring.ultimoquetoque.repository.JugadorJpaRepository;
import com.spring.ultimoquetoque.service.EquipoService;

@Service("equipoServiceImpl")
public class EquipoServiceImpl implements EquipoService{
	
	@Autowired
	@Qualifier("equipoRepository")
	private EquipoJpaRepository equipoJpaRepository;
	
	@Autowired
	private DozerBeanMapper dozer;
	
	@Override
	public List<EquipoModel> listEquipos() {
		
		List<Equipo> listaE=equipoJpaRepository.findAll();
        List<EquipoModel> listaEM=new ArrayList<>();
        listaE.forEach(a->{
            EquipoModel equipoModel=transform(a);
            listaEM.add(equipoModel);
        });

        //Collections.sort(listaEM, (EquipoModel e1, EquipoModel e2) -> e1.getNombre().compareTo(e2.getNombre()));

        return listaEM;
	}

	@Override
	public EquipoModel addEquipo(EquipoModel equipoModel) {
		Equipo equipo=transform(equipoModel);
        return transform(equipoJpaRepository.save(equipo));
	}

 
	@Override
    public EquipoModel updateEquipo(EquipoModel equipoModel){
		  Equipo equipo=transform(equipoModel);
	      return transform(equipoJpaRepository.save(equipo));
    } 

	@Override
	public int removeEquipo(int id) {
		equipoJpaRepository.deleteById(id);
		return 0;
	}

	@Override
	public EquipoModel detailequipo(int id) {	
        return transform(equipoJpaRepository.findById(id));
	}
	
	@Override
	public Equipo transform(EquipoModel equipoModel) {
		return dozer.map(equipoModel, Equipo.class);
	}
	
	@Override
	public EquipoModel transform(Equipo equipo) {
		return dozer.map(equipo, EquipoModel.class);
	}

	@Override
	public EquipoModel filtrarEquipo(int id) {
		List<Equipo> listaE=equipoJpaRepository.findAll();
		EquipoModel em = new EquipoModel();
    
        for (int i = 0; i < listaE.size(); i++) {
			if (listaE.get(i).getId()==id){
				em = transform(listaE.get(i));
			}
		}

        return em;
	}

}
