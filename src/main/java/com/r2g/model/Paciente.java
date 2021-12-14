package com.r2g.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import io.swagger.v3.oas.annotations.media.Schema;

@Schema(description="Paciente Model")
@Entity
@Table(name = "paciente")
public class Paciente {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idPaciente;
	
	@NotNull
	@Size(min = 3, message = "{nombres.size}")
	@Column(name = "nombres", nullable = false, length = 70)
	private String nombres;
//i18n => standar idiomas
	// Validacion 2.3 Y ano bienen los paquetes se debe agregar
	// pom
	@NotNull
	@Size(min = 3, message = "{apellidos.size}")
	@Column(name = "apellidos", nullable = false, length = 70)
	private String apellidos;
	
	@Size(min = 8, max = 8, message = "DNI debe tener 8 caracteres")
	@Column(name = "dni", nullable = false, length = 8, unique = true)
	private String dni;
	
	@NotNull
	@Size(min = 3, message = "direccion minimo 3 caracteres")	
	@Column(name = "direccion", length = 150)
	private String direccion;
	
	@NotNull
	@Size(min = 7, max = 15, message = "telefono debe tener min 7 caracteres")
	@Column(name = "telefono", nullable = false, length = 18)
	private String telefono;
	
	@Column(name = "email", length = 60)
	private String email;

	public Integer getIdPaciente() {
		return idPaciente;
	}

	public void setIdPaciente(Integer idPaciente) {
		this.idPaciente = idPaciente;
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

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
