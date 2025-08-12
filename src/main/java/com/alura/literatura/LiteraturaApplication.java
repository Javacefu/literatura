package com.alura.literatura;

import com.alura.literatura.principal.Principal;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;

@SpringBootApplication
public class LiteraturaApplication {

	public static void main(String[] args) throws IOException, InterruptedException {

		SpringApplication.run(LiteraturaApplication.class, args);

		// Inicial el menu en consola
		Principal principal = new Principal();
		principal.muestraElMenu();
	}
	
}
