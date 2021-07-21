package it.corso.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Contatto implements Serializable {
	
	@Id
	@GeneratedValue
	@OneToMany
	private Long id;
	
	@Column
	private String nome;
	
	@Column
	private String cognome;
	
	@OneToMany(mappedBy="contatti")
	Telefono telefono;
	

	public Contatto() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
}
