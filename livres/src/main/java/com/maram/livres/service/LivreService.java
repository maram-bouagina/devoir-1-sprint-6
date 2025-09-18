package com.maram.livres.service;
import java.util.List;

import com.maram.livres.model.Genre;
import com.maram.livres.model.Livre;



public interface LivreService {
	
	
    Livre saveLivre(Livre l);
    Livre updateLivre(Livre l);
    void deleteLivre(Livre l);
    void deleteLivreById(Long id);
    Livre getLivre(Long id);
    List <Livre> getAllLivres();
    List<Livre> findByTitreLivre(String nom);
    List<Livre> findByTitreLivreContains(String nom);
    List<Livre> findByTitrePrix(String nom, Double prix);
    List<Livre> findByGenre(Genre genre);
    List<Livre> findByGenreIdGenre(Long id);
    List<Livre> findByOrderByTitreAsc();
    List<Livre> trierLivresTitresPrix();
    
}
