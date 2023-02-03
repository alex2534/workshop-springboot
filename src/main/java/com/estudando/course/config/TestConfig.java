package com.estudando.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.estudando.course.entites.User;
import com.estudando.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{

	//Injeção de dependencia
	@Autowired//resovle o uso de dependencia e associa uma instância
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
	
		//Tudo que estiver aqui vai ser executado quando a aplicação rodar
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888", "123456");
		User u2 = new User(null, "Alex Green", "alex@gmail.com", "977777777", "123456");

		//para salvar os itens no banco de dados
		userRepository.saveAll(Arrays.asList(u1, u2));

	}

}
