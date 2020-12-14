package com.spring.ultimoquetoque.service.impl;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.spring.ultimoquetoque.entity.Clasificacion;
import com.spring.ultimoquetoque.entity.Equipo;
import com.spring.ultimoquetoque.model.ClasificacionModel;
import com.spring.ultimoquetoque.model.EquipoModel;
import com.spring.ultimoquetoque.model.JuegaModel;
import com.spring.ultimoquetoque.repository.ClasificacionJpaRepository;
import com.spring.ultimoquetoque.repository.EquipoJpaRepository;
import com.spring.ultimoquetoque.repository.JuegaJpaRepository;
import com.spring.ultimoquetoque.service.ClasificacionService;
import com.spring.ultimoquetoque.service.EquipoService;
import com.spring.ultimoquetoque.service.JuegaService;

@Service("clasificacionServiceImpl")
public class ClasificacionServiceImpl implements ClasificacionService{
	
	private static final Log LOG=LogFactory.getLog(ClasificacionServiceImpl.class);
	
	@Autowired
	@Qualifier("clasificacionRepository")
	private ClasificacionJpaRepository clasificacionJpaRepository;
	
	@Autowired
	@Qualifier("juegaRepository")
	private JuegaJpaRepository juegaJpaRepository;
	
	@Autowired
	@Qualifier("juegaServiceImpl")
	private JuegaService juegaService;
	
	@Autowired
	@Qualifier("equipoServiceImpl")
	private EquipoService equipoService;
	
	@Autowired
	@Qualifier("equipoRepository")
	private EquipoJpaRepository equipoJpaRepository;
	
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
	public void modificarClasificacion(JuegaModel jm) {
		
		
		//JuegaModel jm = juegaService.juegafindById(id_resultado);
		
		// Probar con el findById para sacar los datos del juega
		
		/*List<Juega> jlist = juegaJpaRepository.findAll();
		JuegaModel jm = new JuegaModel();
		for (int i = 0; i > jlist.size(); i++) {
			if (jlist.get(i).getId()==id_resultado) {
				jm = juegaService.transform(jlist.get(i));
			}
		}*/
		
		int equipolocal = jm.getEquipo_local().getId(); 
		LOG.info("Equipo Local " + jm.getEquipo_local().getNombre());
		int equipovisitante = jm.getEquipo_visitante().getId();
		
		String[] resultado = jm.getResultado().split("-"); // Ej: 3-2
		String reslocal = resultado[0];
		String resvis = resultado[1];
		
		List<Clasificacion> listequipos = clasificacionJpaRepository.findAll();
		ClasificacionModel cm = new ClasificacionModel();
		ClasificacionModel cmvis = new ClasificacionModel();
		for (int i = 0; i < listequipos.size(); i++) {
			if (listequipos.get(i).getId()==equipolocal) {
				cm = transform(listequipos.get(i));
			} else if (listequipos.get(i).getId()==equipovisitante) {
				cmvis = transform(listequipos.get(i));
			}
		}
	
		Equipo eqloc = equipoJpaRepository.findById(equipolocal);
		EquipoModel emodelloc = equipoService.transform(eqloc);
		
		Equipo evis = equipoJpaRepository.findById(equipovisitante);
		EquipoModel emodelvis = equipoService.transform(evis);
		
		int pj = cm.getPj();
		int pg = cm.getPg();
		int pe = cm.getPe();
		int pp = cm.getPp();
		int gf = cm.getGf();
		int gc = cm.getGc();
		int puntos = cm.getPuntos();
		
		if (Integer.parseInt(reslocal) > Integer.parseInt(resvis)) {			
			pj++;
			
			for (int j = 0; j < listequipos.size(); j++) {
				
				if (listequipos.get(j).getEquipo().getId() == emodelloc.getId()) {
					LOG.info("Este log muestra que el equipo local ha ganado en casa");
					LOG.info("Equipo Local " + emodelloc.getNombre());
					pg+=1;
					gf += Integer.parseInt(reslocal);
					gc += Integer.parseInt(resvis);
					puntos += 3;
					cm.setPuntos(puntos);
					LOG.info("Puntos: " + cm.getPuntos());
					cm.setPj(pj);
					LOG.info("PJ: " + cm.getPj());
					cm.setPg(pg);
					LOG.info("PG: " + cm.getPg());
					cm.setGf(gf);
					LOG.info("GF: " + cm.getGf());
					cm.setGc(gc);
					LOG.info("GC: " + cm.getGc());
				} else if (listequipos.get(j).getEquipo().getId() == emodelvis.getId()){ 
					LOG.info("Equipo Visitante " + emodelvis.getNombre());
					pp +=1;
					gf += Integer.parseInt(resvis);
					gc += Integer.parseInt(reslocal);
					puntos += 0;
					cm.setPuntos(puntos);
					LOG.info("Puntos: " + cm.getPuntos());
					cm.setPj(pj);
					LOG.info("PJ: " + cm.getPj());
					cm.setPp(pp);
					LOG.info("PP: " + cm.getPp());
					LOG.info("PG: " + cm.getPg());
					cm.setGf(gf);
					LOG.info("GF: " + cm.getGf());
					cm.setGc(gc);
					LOG.info("GC: " + cm.getGc());
				}
			}			
			
		}else if (Integer.parseInt(reslocal) < Integer.parseInt(resvis)){
			pj++;
			for (int j = 0; j < listequipos.size(); j++) {
			if (listequipos.get(j).getEquipo().getId() == emodelloc.getId()) {
				LOG.info("Este log muestra que el equipo local ha perdido jugando en casa");
				LOG.info("Equipo Local " + emodelloc.getNombre());
				pp+=1;
				gf += Integer.parseInt(reslocal);
				gc += Integer.parseInt(resvis);
				puntos += 0;
				cm.setPuntos(puntos);
				LOG.info("Puntos: " + cm.getPuntos());
				cm.setPj(pj);
				LOG.info("PJ: " + cm.getPj());
				cm.setPp(pp);
				LOG.info("PP: " + cm.getPp());
				cm.setGf(gf);
				LOG.info("GF: " + cm.getGf());
				cm.setGc(gc);
				LOG.info("GC: " + cm.getGc());
			} else if (listequipos.get(j).getEquipo().getId() == emodelvis.getId()){ 
				LOG.info("Equipo Visitante " + emodelvis.getNombre());
				pg +=1;
				gf += Integer.parseInt(resvis);
				gc += Integer.parseInt(reslocal);
				puntos += 3;
				cm.setPuntos(puntos);
				LOG.info("Puntos: " + cm.getPuntos());
				cm.setPj(pj);
				LOG.info("PJ: " + cm.getPj());
				cm.setPg(pg);
				LOG.info("PG: " + cm.getPg());
				cm.setGf(gf);
				LOG.info("GF: " + cm.getGf());
				cm.setGc(gc);
				LOG.info("GC: " + cm.getGc());
				}
			} // final for
		} else {
			pj++;
			for (int j = 0; j < listequipos.size(); j++) {
			if (listequipos.get(j).getEquipo().getId() == emodelloc.getId()) {
				LOG.info("Este log muestra que el equipo local ha empatado");
				LOG.info("Equipo Local " + emodelloc.getNombre());
				pe+=1;
				gf += Integer.parseInt(reslocal);
				gc += Integer.parseInt(resvis);
				puntos += 1;
				cm.setPuntos(puntos);
				LOG.info("Puntos: " + cm.getPuntos());
				cm.setPj(pj);
				LOG.info("PJ: " + cm.getPj());
				cm.setPe(pe);
				LOG.info("PE: " + cm.getPe());
				cm.setGf(gf);
				LOG.info("GF: " + cm.getGf());
				cm.setGc(gc);
				LOG.info("GC: " + cm.getGc());
				
			} else if (listequipos.get(j).getEquipo().getId() == emodelvis.getId()){ 
				LOG.info("Equipo Visitante " + emodelvis.getNombre());
				pe +=1;
				gf += Integer.parseInt(resvis);
				gc += Integer.parseInt(reslocal);
				puntos += 1;
				cm.setPuntos(puntos);
				LOG.info("Puntos: " + cm.getPuntos());
				cm.setPj(pj);
				LOG.info("PJ: " + cm.getPj());
				cm.setPe(pe);
				LOG.info("PE: " + cm.getPe());
				cm.setGf(gf);
				LOG.info("GF: " + cm.getGf());
				cm.setGc(gc);
				LOG.info("GC: " + cm.getGc());
				}
			}
		}
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