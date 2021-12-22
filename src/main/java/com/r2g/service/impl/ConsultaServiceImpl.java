package com.r2g.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.r2g.dto.ConsultaListaExamenDTO;
import com.r2g.model.Consulta;
import com.r2g.repo.IConsultaExamenRepo;
import com.r2g.repo.IConsultaRepo;
import com.r2g.repo.IGenericRepo;
import com.r2g.service.IConsultaService;

@Service
public class ConsultaServiceImpl extends CRUDImpl<Consulta,Integer> implements IConsultaService {

    @Autowired
    private IConsultaRepo repo;

    @Autowired
    private IConsultaExamenRepo ceRepo;
    
	@Override
	protected IGenericRepo<Consulta, Integer> getRepo() {
		return repo;
	}
	@Transactional
	@Override
	public Consulta registrarTransaccional(ConsultaListaExamenDTO dto) throws Exception {
		dto.getConsulta().getDetalleConsulta().forEach(det->det.setConsulta(dto.getConsulta()));
		repo.save(dto.getConsulta());
		dto.getLstExamen().forEach(ex->ceRepo.registrar(dto.getConsulta().getIdConsulta(), ex.getIdExamen()));
		
		return dto.getConsulta();
	}

	
	
}
