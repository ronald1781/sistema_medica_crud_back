package com.r2g.service;

import java.util.List;

import com.r2g.model.Medico;
/*
 *Dejo de referencia para ejemplo 
 **/
public interface IMedicoService_back {

    Medico registrar(Medico p);

    Medico modificar(Medico p);

    List<Medico> listar();

    Medico listarPorId(Integer id);

    void eliminar(Integer id);
}
