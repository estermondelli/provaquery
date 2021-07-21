package it.corso.service;

import java.util.List;

import it.corso.model.Contatto;
import it.corso.model.Telefono;

public interface ContattoService {
	List<Telefono> trovaNumeri();
	List<Contatto> trovaContatto(String cognome);
	List<Telefono> trovaNumeri(Contatto contatto);
	List<Telefono> trovaNumeri(String nome);
	
	List<Telefono> inserisciContatti();
	List<Telefono> inserisciTelefoni(Contatto contatto);
}
