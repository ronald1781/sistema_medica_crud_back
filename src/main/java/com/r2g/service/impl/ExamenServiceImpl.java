package com.r2g.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.r2g.model.Examen;
import com.r2g.repo.IExamenRepo;
import com.r2g.repo.IGenericRepo;
import com.r2g.service.IExamenService;

@Service
public class ExamenServiceImpl extends CRUDImpl<Examen,Integer> implements IExamenService {

    @Autowired
    private IExamenRepo repo;

	@Override
	protected IGenericRepo<Examen, Integer> getRepo() {
		return repo;
	}


}
