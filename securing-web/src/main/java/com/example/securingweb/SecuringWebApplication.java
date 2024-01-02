package com.example.securingweb;

import com.example.securingweb.model.Post;
import com.example.securingweb.repository.PostRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SecuringWebApplication {

	public static void main(String[] args) throws Throwable {

		SpringApplication.run(SecuringWebApplication.class, args);
	}

	@Bean
	CommandLineRunner commandLineRunner(PostRepository posts){
		return args -> {
			posts.save(new Post("Hello, World!","hello-world", "welcome to my blog","KMB"));
		};
	}

}
