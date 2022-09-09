package com.primeit.digitalbank.api.cadastro.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "banco")
public class Banco {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idbc;
	private String banco;
	private String codigo;
	private int visivel;
	
	public Banco() {
		
	}
	
	public Banco(int idBc, String banco, String codigo, int visivel) {
		super();
		this.idbc = idBc;
		this.banco = banco;
		this.codigo = codigo;
		this.visivel = visivel;
	}

	public int getIdbc() {
		return idbc;
	}

	public void setIdbc(int idbc) {
		this.idbc = idbc;
	}

	public String getBanco() {
		return banco;
	}

	public void setBanco(String banco) {
		this.banco = banco;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public int getVisivel() {
		return visivel;
	}

	public void setVisivel(int visivel) {
		this.visivel = visivel;
	}
	
	
	
}
