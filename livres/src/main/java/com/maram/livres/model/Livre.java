package com.maram.livres.model;
import java.util.Date;

//import org.springframework.data.rest.core.config.Projection;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity

//@Projection(name = "nomLiv", types = { Livre.class })
public class Livre {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idLivre;
    private String titre;
    private Double prixLivre;
    private Date datePublication;
    @ManyToOne
    private Genre genre;
    

	@Override
	public String toString() {
		return "Livre [idLivre=" + idLivre + ", titre=" + titre + ", prixLivre=" + prixLivre + ", datePublication="
				+ datePublication + "]";
	}

  
    

   
}