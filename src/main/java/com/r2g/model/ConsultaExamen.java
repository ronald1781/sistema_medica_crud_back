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
	
	//private Integer idConsulta;
	@Id
	private Consulta consulta;
	
	//private Integer idExamen;
	@Id
	private Examen examen;
	
	public Consulta getConsulta() {
		return consulta;
	}

	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}

	public Examen getExamen() {
		return examen;
	}

	public void setExamen(Examen examen) {
		this.examen = examen;
	}
}
