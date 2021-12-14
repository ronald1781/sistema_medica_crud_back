package com.r2g.model;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "consulta") // para oracle se pone esquema shema=""
public class Consulta {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idConsulta;

	@ManyToOne // foranio de muchoss uno.
	@JoinColumn(name = "id_paciente",nullable = false,foreignKey = @ForeignKey(name="FK_consulta_paciente"))
	private Paciente paciente;

	@ManyToOne
	@JoinColumn(name = "id_medico",nullable = false,foreignKey = @ForeignKey(name="FK_consulta_medico"))
	private Medico medico;

	@ManyToOne
	@JoinColumn(name = "id_especialidad",nullable = false,foreignKey = @ForeignKey(name="FK_consulta_especilidad"))
	private Especialidad especilidad;
	
	@Column(name = "num_consultorio",nullable=false,length = 3)
	private String numConsultorio;
	
	@Column(name="fecha",nullable = false)
	private LocalDateTime fecha;
	
	@OneToMany(mappedBy = "consulta",cascade = {CascadeType.ALL},orphanRemoval = true)
	private List<DetalleConsulta> detalleConsulta;

	public Integer getIdConsulta() {
		return idConsulta;
	}

	public void setIdConsulta(Integer idConsulta) {
		this.idConsulta = idConsulta;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Especialidad getEspecilidad() {
		return especilidad;
	}

	public void setEspecilidad(Especialidad especilidad) {
		this.especilidad = especilidad;
	}

	public String getNumConsultorio() {
		return numConsultorio;
	}

	public void setNumConsultorio(String numConsultorio) {
		this.numConsultorio = numConsultorio;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public List<DetalleConsulta> getDetalleConsulta() {
		return detalleConsulta;
	}

	public void setDetalleConsulta(List<DetalleConsulta> detalleConsulta) {
		this.detalleConsulta = detalleConsulta;
	}
	
	//1 objecto (consulta -> Lista<etalleConsulta> Lista
	// iNSERT INTO cONSULTA
	// FOR LISTA* INSERT INTO dETALLE(PK_CONSULTA)
	//jpa me estoy quedado en jpa mapeo de tablas en 1.05:48
}
