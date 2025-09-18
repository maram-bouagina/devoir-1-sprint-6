package com.maram.livres;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import java.util.Date;
import java.util.List;

import com.maram.livres.model.Genre;
import com.maram.livres.model.Livre;
import com.maram.livres.repos.LivreRepository;

@SpringBootTest
class LivresApplicationTests {

	@Test
	void contextLoads() {
	}

    @Autowired
    private LivreRepository livreRepository;

   @Test
    public void testCreateLivre() {
        Genre gen = new Genre();
       gen.setIdGenre(2L);
        
        Livre liv = Livre.builder()
        	    .titre("Great Gatspy")
        	    .prixLivre(50.0)
        	    .datePublication(new Date())
        	    .genre(gen)
        	    .build();
        livreRepository.save(liv);
    }

   @Test
    public void testFindLivre() {
        Livre l = livreRepository.findById(2L).get();
        System.out.println(l);
    }

    @Test
    public void testUpdateLivre() {
        Livre l = livreRepository.findById(2L).get();
        l.setPrixLivre(100.0);
        livreRepository.save(l);
    }

    @Test
    public void testDeleteLivre() {
        livreRepository.deleteById(3L);
    }

    @Test
    public void testListerTousLivres() {
        List<Livre> livres = livreRepository.findAll();
        for (Livre l : livres) {
            System.out.println(l);
        }
    }
    
    
    
    
    
    @Test
    public void testFindByTitre() {
        List<Livre> livres = livreRepository.findByTitre("Great Gatspy");
        System.out.println("look at this! Here you 'll find a list of books with a specefic title");

        for (Livre l : livres) {
            System.out.println(l);
        }
    }

    @Test
    public void testFindByTitreContains() {
        List<Livre> livres = livreRepository.findByTitreContains("Good");
        System.out.println("look at this!  Here, you 'll find a list of books with titles that contains the chosen noun");

        for (Livre l : livres) {
            System.out.println(l);
        }
    }

    @Test
    public void testFindByTitrePrix() {
        List<Livre> livres = livreRepository.findByTitrePrix("Great Gatspy", 50.0);
        System.out.println("look at this!  Here, you 'll find a list of books with with a specefic title and price");

        for (Livre l : livres) {
            System.out.println(l);
        }
    }

    @Test
    public void testFindByGenre() {
        Genre gen = new Genre();
        gen.setIdGenre(1L);
        List<Livre> livres = livreRepository.findByGenre(gen);
        System.out.println("look at this! Here, you 'll find a list of books found by  genre");

        for (Livre l : livres) {
            System.out.println(l);
        }
    }

    @Test
    public void testFindByGenreIdGenre() {
        List<Livre> livres = livreRepository.findByGenreIdGenre(1L);
        System.out.println("look at this! Here, you 'll find a list of books found by the id of the genre");

        for (Livre l : livres) {
            System.out.println(l);
        }
    }

    @Test
    public void testFindByOrderByTitreAsc() {
        List<Livre> livres = livreRepository.findByOrderByTitreAsc();
        System.out.println("look at this! I am sorting books per title with ascendant order");
        for (Livre l : livres) {
            System.out.println(l);
        }
    }

    @Test
    public void testTrierLivresTitresPrix() {
        List<Livre> livres = livreRepository.trierLivresTitresPrix();
        System.out.println("look at this! I am sorting books per price and title");
        for (Livre l : livres) {
            System.out.println(l);
        }
    }
}
