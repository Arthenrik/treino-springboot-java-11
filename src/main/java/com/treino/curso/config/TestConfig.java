package com.treino.curso.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.treino.curso.entidades.Usuario;
import com.treino.curso.repositorios.RepositorioDoUsuario;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private RepositorioDoUsuario repositorioDoUsuario;

	@Override
	public void run(String... args) throws Exception {
		
		Usuario u1 = new Usuario(null, "Samuel Marcelino ", "sans@gmail.com", "988888888", "123456"); 
		Usuario u2 = new Usuario(null, "Christiano Morais", "niniano@gmail.com", "977777777", "123456"); 
		
		repositorioDoUsuario.saveAll(Arrays.asList(u1, u2));
	}
}
