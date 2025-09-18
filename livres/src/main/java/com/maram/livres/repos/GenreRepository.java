package com.maram.livres.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.maram.livres.model.Genre;
@RepositoryRestResource(path = "gen")  
@CrossOrigin("http://localhost:4200") 
public interface GenreRepository  extends JpaRepository<Genre, Long> {

}
