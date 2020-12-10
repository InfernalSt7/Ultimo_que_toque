package com.spring.ultimoquetoque.service.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;


import com.spring.ultimoquetoque.entity.Equipo;
import com.spring.ultimoquetoque.entity.Jugador;
import com.spring.ultimoquetoque.model.EquipoModel;
import com.spring.ultimoquetoque.model.JugadorModel;
import com.spring.ultimoquetoque.repository.JugadorJpaRepository;
import com.spring.ultimoquetoque.service.JugadorService;

@Service("jugadorServiceImpl")
public class JugadorServiceImpl implements JugadorService{
	
	@Autowired
	@Qualifier("jugadorRepository")
	private JugadorJpaRepository jugadorJpaRepository;
	
	@Autowired
	private DozerBeanMapper dozer;

	@Override
	public int removeJugador(int id) {
		jugadorJpaRepository.deleteById(id);
		return 0;
	}

	@Override
	public List<JugadorModel> listJugadores() {
		List<Jugador> listaJ=jugadorJpaRepository.findAll();
        List<JugadorModel> listaJM=new ArrayList<>();
        listaJ.forEach(a->{
            JugadorModel jugadorModel=transform(a);
            listaJM.add(jugadorModel);
        });

        

        return listaJM;
	}

	@Override
	public JugadorModel addJugador(JugadorModel jugadorModel) {
		Jugador jugador=transform(jugadorModel);
        return transform(jugadorJpaRepository.save(jugador));
	}

	@Override
	public JugadorModel updateJugador(JugadorModel jugadorModel) {
		Jugador jugador=transform(jugadorModel);
	    return transform(jugadorJpaRepository.save(jugador));
	}

	@Override
	public List<JugadorModel> detailjugador(int id) {
		List<Jugador> listaJ=jugadorJpaRepository.findAll();
        List<JugadorModel> listaJM=new ArrayList<>();
        for (int i = 0; i < listaJ.size(); i++) {
			if (listaJ.get(i).getId_equipo().getId()==id){
				listaJM.add(transform(listaJ.get(i)));
			}
		}

        

        return listaJM;
	}
	
	@Override
	public Jugador transform(JugadorModel jugadorModel) {
		return dozer.map(jugadorModel, Jugador.class);
	}

	@Override
	public JugadorModel transform(Jugador jugador) {
		return dozer.map(jugador, JugadorModel.class);
	}
	
}
