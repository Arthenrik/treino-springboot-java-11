package com.treino.curso.servicos;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.treino.curso.entidades.Usuario;
import com.treino.curso.repositorios.RepositorioDoUsuario;

@Service
public class ServicoUsuario {
	
	@Autowired
	private RepositorioDoUsuario repositorio;
	
	public List<Usuario> findAll() {
		return repositorio.findAll();
	}
	
	public Usuario findByID(Long id) {
		Optional<Usuario> obj = repositorio.findById(id);
		return obj.get();
	}
}
