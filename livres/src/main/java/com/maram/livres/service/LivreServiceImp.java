package com.maram.livres.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.maram.livres.model.Genre;
import com.maram.livres.model.Livre;

import com.maram.livres.repos.LivreRepository;

@Service
public class LivreServiceImp implements LivreService {
	@Autowired
	LivreRepository livreRepository;

	@Override
	public Livre saveLivre(Livre l) {
		return livreRepository.save(l);
	}

	@Override
	public Livre updateLivre(Livre l) {
		return livreRepository.save(l);
	}

	@Override
	public void deleteLivre(Livre l) {
		livreRepository.delete(l);
	}

	@Override
	public void deleteLivreById(Long id) {
		livreRepository.deleteById(id);
	}

	@Override
	public Livre getLivre(Long id) {
		return livreRepository.findById(id).get();
	}

	@Override
	public List<Livre> getAllLivres() {
		return livreRepository.findAll();
	}

	@Override
	public List<Livre> findByTitreLivre(String nom) {
		return livreRepository.findByTitre(nom);
	}

	@Override
	public List<Livre> findByTitreLivreContains(String nom) {
		return livreRepository.findByTitreContains(nom);
	}

	@Override
	public List<Livre> findByTitrePrix(String nom, Double prix) {
		return livreRepository.findByTitrePrix(nom, prix);
	}

	@Override
	public List<Livre> findByGenre(Genre genre) {
		return livreRepository.findByGenre(genre);
	}

	@Override
	public List<Livre> findByGenreIdGenre(Long id) {
		return livreRepository.findByGenreIdGenre(id);
	}

	@Override
	public List<Livre> findByOrderByTitreAsc() {
		return livreRepository.findByOrderByTitreAsc();
	}

	@Override
	public List<Livre> trierLivresTitresPrix() {
		return livreRepository.trierLivresTitresPrix();
	}

}
