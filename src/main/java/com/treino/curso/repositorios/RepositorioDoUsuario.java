package com.treino.curso.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.treino.curso.entidades.Usuario;

public interface RepositorioDoUsuario extends JpaRepository<Usuario, Long> {

}
