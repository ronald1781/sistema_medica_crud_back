package com.r2g.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="medico")
public class Medico {

	//JPQL
	//FROM Medico m WHERE m.nombres='x';
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idMedico;
	
	@Column(name="nombres",nullable=false,length=70)
	private String nombres;
	
	@Column(name="apellidos",nullable=false,length=70)
	private String apellidos;

	@Column(name="CPM",nullable=false,length=12)
	private String CPM;
	
	@Column(name="fotoUrl",nullable=false)
	private String fotoUrl;
	
	public Integer getIdMedico() {
		return idMedico;
	}
	public void setIdMedico(Integer idMedico) {
		this.idMedico = idMedico;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getCPM() {
		return CPM;
	}
	public void setCPM(String cPM) {
		CPM = cPM;
	}
	public String getFotoUrl() {
		return fotoUrl;
	}
	public void setFotoUrl(String fotoUrl) {
		this.fotoUrl = fotoUrl;
	}
	
	
}
