package com.r2g.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.r2g.model.Paciente;

public interface IPacienteRepo extends JpaRepository<Paciente, Integer> {

}
