package com.r2g.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.r2g.model.Medico;
import com.r2g.repo.IMedicoRepo;
import com.r2g.service.IMedicoService;
/*
@Service
public class MedicoServiceImpl_back implements IMedicoService {

    @Autowired
    private IMedicoRepo repo;

    @Override
    public Medico registrar(Medico p) {
        return repo.save(p);
    }

    @Override
    public Medico modificar(Medico p) {
        return repo.save(p);
    }

    @Override
    public List<Medico> listar() {
        return repo.findAll();
    }

    @Override
    public Medico listarPorId(Integer id) {
        Optional<Medico> op = repo.findById(id);
        return op.isPresent() ? op.get() : new Medico();
    }

    @Override
    public void eliminar(Integer id) {
        repo.deleteById(id);

    }

}
*/