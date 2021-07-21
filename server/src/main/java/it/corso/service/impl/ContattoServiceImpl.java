package it.corso.service.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import it.corso.model.Contatto;
import it.corso.model.Telefono;
import it.corso.repository.ContattoRepository;
import it.corso.service.ContattoService;

@Service
@Transactional
public class ContattoServiceImpl implements ContattoService {

	@Autowired
	ContattoRepository contattoRepository;

	@Override
	public List<Telefono> trovaNumeri() {
		return contattoRepository.findByTelefonoOrderByIdAsc();
	}

	@Override
	public List<Contatto> trovaContatto(String cognome) {
		return contattoRepository.findByCognomeContaining(cognome);
	}

	@Override
	public List<Telefono> trovaNumeri(Contatto contatto) {
		return contattoRepository.findByTelefonoAndNomeContainingAndCognomeContaining(contatto);
	}

	@Override
	public List<Telefono> trovaNumeri(String nome) {
		return contattoRepository.findByNomeEndingWith(nome);
	}

	@Override
	public List<Telefono> inserisciContatti() {
		Contatto c = new Contatto();
		
		return null;
	}

	@Override
	public List<Telefono> inserisciTelefoni(Contatto contatto) {
		// TODO Auto-generated method stub
		return null;
	}
	
}
