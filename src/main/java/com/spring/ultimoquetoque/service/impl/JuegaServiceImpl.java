package com.spring.ultimoquetoque.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.spring.ultimoquetoque.entity.Juega;
import com.spring.ultimoquetoque.model.JuegaModel;
import com.spring.ultimoquetoque.repository.JuegaJpaRepository;
import com.spring.ultimoquetoque.service.JuegaService;

@Service("juegaServiceImpl")
public class JuegaServiceImpl implements JuegaService{
	
	@Autowired
	@Qualifier("juegaRepository")
	private JuegaJpaRepository juegaJpaRepository;
	
	@Autowired
	private DozerBeanMapper dozer;

	@Override
	public List<JuegaModel> listResultados() {
		List<Juega> listaJ=juegaJpaRepository.findAll();
        List<JuegaModel> listaJM=new ArrayList<>();
        listaJ.forEach(a->{
            JuegaModel juegaModel=transform(a);
            listaJM.add(juegaModel);
        });

        return listaJM;
	}

	@Override
	public JuegaModel addResultados(JuegaModel juegaModel) {
		Juega juega=transform(juegaModel);
        return transform(juegaJpaRepository.save(juega));
	}

	@Override
	public int removeResultados(int id) {
		juegaJpaRepository.deleteById(id);
		return 0;
	}

	@Override
	public JuegaModel updateResultados(JuegaModel juegaModel) {
		Juega juega=transform(juegaModel);
	    return transform(juegaJpaRepository.save(juega));
	}

	@Override
	public JuegaModel detailResultados(int id) {
		return transform(juegaJpaRepository.findById(id));
	}

	@Override
	public Juega transform(JuegaModel juegaModel) {
		return dozer.map(juegaModel, Juega.class);
	}

	@Override
	public JuegaModel transform(Juega juega) {
		return dozer.map(juega, JuegaModel.class);
	}
}
