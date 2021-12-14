package com.r2g.service;

import java.util.List;

import com.r2g.model.Paciente;

public interface IPacienteService {

    Paciente registrar(Paciente p);

    Paciente modificar(Paciente p);

    List<Paciente> listar();

    Paciente listarPorId(Integer id);

    void eliminar(Integer id);
}
