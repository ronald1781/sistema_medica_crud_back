package com.r2g.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.r2g.model.Medico;
import com.r2g.repo.IGenericRepo;
import com.r2g.repo.IMedicoRepo;
import com.r2g.service.IMedicoService;

@Service
public class MedicoServiceImpl extends CRUDImpl<Medico,Integer> implements IMedicoService {

    @Autowired
    private IMedicoRepo repo;

	@Override
	protected IGenericRepo<Medico, Integer> getRepo() {
		return repo;
	}


}
