package com.primeit.digitalbank.api.cadastro.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "outraconta")
public class OutraConta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idoct;

	private int idcad;

	private int idbc;

	@Column(nullable = false)
	private int conta;

	@Column(nullable = false)
	private String digito;

	@Column(nullable = false)
	private int agencia;

	@Column(nullable = false)
	private String digitoag;

	@Column(nullable = false)
	private Timestamp dtcriacao;

	public OutraConta() {
		super();
	}

	public int getIdoct() {
		return idoct;
	}

	public void setIdoct(int idoct) {
		this.idoct = idoct;
	}

	public int getIdcad() {
		return idcad;
	}

	public void setIdcad(int idcad) {
		this.idcad = idcad;
	}

	public int getIdbc() {
		return idbc;
	}

	public void setIdbc(int idbc) {
		this.idbc = idbc;
	}

	public int getConta() {
		return conta;
	}

	public void setConta(int conta) {
		this.conta = conta;
	}

	public String getDigito() {
		return digito;
	}

	public void setDigito(String digito) {
		this.digito = digito;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public String getDigitoag() {
		return digitoag;
	}

	public void setDigitoag(String digitoag) {
		this.digitoag = digitoag;
	}

	public Timestamp getDtcriacao() {
		return dtcriacao;
	}

	public void setDtcriacao(Timestamp dtcriacao) {
		this.dtcriacao = dtcriacao;
	}

}
