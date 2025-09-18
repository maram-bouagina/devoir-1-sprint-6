package com.maram.livres.model;


import org.springframework.data.rest.core.config.Projection;

@Projection(name = "titre", types = { Livre.class })
public interface LivreProjection {
    String getTitre();
}