package com.alura.literatura;

import com.alura.literatura.client.ClienteLiteratura;
import com.alura.literatura.repository.AutorRepository;
import com.alura.literatura.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.sql.DataSource;

@SpringBootApplication
//@EnableJpaRepositories(basePackages = "com.alura.literatura.repository")
public class LiteraturaApplication{

//	@Autowired
//	private LibroRepository libroRepository;
//	@Autowired
//	private AutorRepository autorRepositorio;

	public static void main(String[] args) {
		SpringApplication.run(LiteraturaApplication.class, args);
	}
//
//	@Override
//	public void run(String... args) throws Exception {
//
//		ClienteLiteratura client = new ClienteLiteratura(libroRepository, autorRepositorio);
//		client.menu();
//	}

}
