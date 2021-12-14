package com.r2g.controller;

import java.net.URI;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.r2g.exception.ModeloNotFoundException;
import com.r2g.model.Paciente;
import com.r2g.service.IPacienteService;

@RestController
@RequestMapping("/pacientes")
public class PacienteController {

	@Autowired
	private IPacienteService service;

	@GetMapping
	/*
	 * public List<Paciente> listar() { return service.listar(); }
	 */
	public ResponseEntity<List<Paciente>> listar() {
		List<Paciente> lista = service.listar();

		return new ResponseEntity<List<Paciente>>(lista, HttpStatus.OK);
	}

	/*
	 * @GetMapping("/{id}") public Paciente listarPorId(@PathVariable("id") Integer
	 * id) { return service.listarPorId(id); }
	 */
	@GetMapping("/{id}")
	public ResponseEntity<Paciente> listarPorId(@PathVariable("id") Integer id) {
		Paciente obj = service.listarPorId(id);
		if (obj.getIdPaciente() == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO " + id);
		}
		return new ResponseEntity<Paciente>(obj, HttpStatus.OK);
	}

	/*
	 * @PostMapping public Paciente registrar(@Valid @RequestBody Paciente p) {
	 * return service.registrar(p); }
	 */
	/*
	 * @PostMapping public ResponseEntity<Paciente> registrar(@Valid @RequestBody
	 * Paciente p) { Paciente obj = service.registrar(p); return new
	 * ResponseEntity<Paciente>(obj, HttpStatus.CREATED); }
	 */
	/* HETEAOS */
	@PostMapping
	public ResponseEntity<Paciente> registrar(@Valid @RequestBody Paciente p) {
		Paciente obj = service.registrar(p);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}")
				.buildAndExpand(obj.getIdPaciente()).toUri();
		return ResponseEntity.created(location).build();
	}

	@PutMapping
	public ResponseEntity<Paciente> modificar(@Valid @RequestBody Paciente p) {
		// return service.modificar(p);
		Paciente obj = service.modificar(p);
		return new ResponseEntity<Paciente>(obj, HttpStatus.OK);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> eliminar(@PathVariable("id") Integer id) {
		Paciente obj = service.listarPorId(id);
		if (obj.getIdPaciente() == null) {
			throw new ModeloNotFoundException("ID NO ENCONTRADO " + id);
		}
		service.eliminar(id);
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}

}
