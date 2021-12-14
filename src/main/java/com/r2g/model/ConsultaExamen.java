package com.r2g.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="consulta_examen")
@IdClass(ConsultaExamenPK.class)
public class ConsultaExamen {

	 //[idConsulta(FK) idExamen(FK) ] PK
	@Id
	//private Integer idConsulta;
	private Consulta consulta;
	@Id
	//private Integer idExamen;
	private Examen examen;
}
