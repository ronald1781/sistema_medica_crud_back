package com.r2g.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.r2g.model.Paciente;
import com.r2g.repo.IGenericRepo;
import com.r2g.repo.IPacienteRepo;
import com.r2g.service.IPacienteService;

@Service
public class PacienteServiceImpl extends CRUDImpl<Paciente,Integer> implements IPacienteService {

    @Autowired
    private IPacienteRepo repo;

	@Override
	protected IGenericRepo<Paciente, Integer> getRepo() {
		return repo;
	}


}
