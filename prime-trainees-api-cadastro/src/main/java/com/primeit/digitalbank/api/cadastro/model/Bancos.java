package com.primeit.digitalbank.api.cadastro.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bancos")
public class Bancos {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idbc;
	
	@Column(nullable = true)
	private String banco;
	
	@Column(nullable = true)
	private String codigo;
	
	@Column(nullable = false)
	private int visivel;

	public Bancos() {
		super();
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
