package com.r2g.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.r2g.model.Especialidad;
import com.r2g.repo.IEspecialidadRepo;
import com.r2g.repo.IGenericRepo;
import com.r2g.service.IEspecialidadService;

@Service
public class EspecialidadServiceImpl extends CRUDImpl<Especialidad,Integer> implements IEspecialidadService {

    @Autowired
    private IEspecialidadRepo repo;

	@Override
	protected IGenericRepo<Especialidad, Integer> getRepo() {
		return repo;
	}


}
