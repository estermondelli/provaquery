package it.corso.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Telefono implements Serializable {
	
	@Id
	@GeneratedValue
	@ManyToOne
	private Long id;
	
	@Column
	private String numero;
	
	@ManyToOne
	List<Contatto> contatti;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
}
