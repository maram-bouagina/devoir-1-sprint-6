package com.maram.livres;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;

import com.maram.livres.model.Genre;
import com.maram.livres.model.Livre;

@SpringBootApplication
public class LivresApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(LivresApplication.class, args);
	}
	 @Autowired
	    private RepositoryRestConfiguration repositoryRestConfiguration;

	    public void run(String... args) throws Exception {
	        repositoryRestConfiguration.exposeIdsFor(Livre.class,Genre.class);
	    }

}
