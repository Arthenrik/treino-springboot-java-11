package com.treino.curso.recursos;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.treino.curso.entidades.Usuario;
import com.treino.curso.servicos.ServicoUsuario;

@RestController
@RequestMapping(value = "/usuarios")
public class RecursoDoUsuario {
	
	@Autowired
	private ServicoUsuario servico;

	@GetMapping
	public ResponseEntity<List<Usuario>> findAll() {
		List<Usuario> lista = servico.findAll();
		return ResponseEntity.ok().body(lista);
	}
	
	@GetMapping(value = "/{id}")
	public ResponseEntity<Usuario> findById(@PathVariable Long id) {
		Usuario obj = servico.findByID(id);
		return ResponseEntity.ok().body(obj);
	}
}
