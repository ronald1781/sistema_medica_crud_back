package com.r2g.service;

import com.r2g.dto.ConsultaListaExamenDTO;
import com.r2g.model.Consulta;

public interface IConsultaService extends ICRUD<Consulta,Integer> {

	Consulta registrarTransaccional(ConsultaListaExamenDTO dto) throws Exception;
   
}
