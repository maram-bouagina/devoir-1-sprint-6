package com.maram.livres.restcontrollers;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import com.maram.livres.model.Livre;
import com.maram.livres.service.LivreService;


@RestController 
@RequestMapping("/api") 
@CrossOrigin(origins = "http://localhost:4200") 
public class LivreRESTControllers {
	
	 @Autowired
	    LivreService livreService;

	    @RequestMapping(path="all",method = RequestMethod.GET)
	    public List<Livre> getAllLivres() {
	        return livreService.getAllLivres();
	    }
        
	    @RequestMapping(value="getbyid/{id}", method = RequestMethod.GET)
	    public Livre getLivreById(@PathVariable("id") Long id) {
	        return livreService.getLivre(id);
	    }

	    @RequestMapping( value="addlivre", method = RequestMethod.POST)
	    public Livre createLivre(@RequestBody Livre livre) {
	        return livreService.saveLivre(livre);
	    }

	    @RequestMapping(path="updatelivre",method = RequestMethod.PUT)
	    public Livre updateLivre(@RequestBody Livre livre) {
	        return livreService.updateLivre(livre);
	    }

	    @RequestMapping(value="dellivre/{id}", method = RequestMethod.DELETE)
	    public void deleteLivre(@PathVariable("id") Long id) {
	        livreService.deleteLivreById(id);
	    }

	    @RequestMapping(value="/livresgenre/{idGenre}", method = RequestMethod.GET)
	    public List<Livre> getLivresByGenreId(@PathVariable("idGenre") Long idGenre) {
	        return livreService.findByGenreIdGenre(idGenre);
	    }
	    @RequestMapping(value="/livresByTitre/{titre}", method = RequestMethod.GET)
	    public List<Livre> findByTitreContains(@PathVariable("titre") String titre) {
	      return livreService.findByTitreLivreContains(titre);
	    }
	
	}

