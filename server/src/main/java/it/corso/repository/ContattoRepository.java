package it.corso.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import it.corso.model.Contatto;
import it.corso.model.Telefono;

public interface ContattoRepository extends JpaRepository<Contatto, Long>{
	
	List<Telefono> findByTelefonoOrderByIdAsc();
	
	List<Contatto> findByCognomeContaining(String nome);
	
	List<Telefono> findByTelefonoAndNomeContainingAndCognomeContaining(Contatto contatto);
	
	List<Telefono> findByNomeEndingWith(String nome);
}
