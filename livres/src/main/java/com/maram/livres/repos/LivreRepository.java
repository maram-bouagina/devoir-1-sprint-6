package com.maram.livres.repos;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.maram.livres.model.Genre;
import com.maram.livres.model.Livre;

@RepositoryRestResource(path = "rest")
public interface LivreRepository  extends JpaRepository<Livre, Long> {
	
    List<Livre> findByTitre(String nom);
    List<Livre> findByTitreContains(String nom);
    
    @Query("select l from Livre l where l.titre like %?1 and l.prixLivre > ?2")
    List<Livre> findByTitrePrix(String titres, Double prix);
    
    @Query("select l from Livre l where l.genre = ?1")
    List<Livre> findByGenre(Genre genre);
    
    List<Livre> findByGenreIdGenre(Long id);
    List<Livre> findByOrderByTitreAsc();
    
    @Query("select l from Livre l order by l.titre ASC, l.prixLivre DESC")
    List<Livre> trierLivresTitresPrix();

}
