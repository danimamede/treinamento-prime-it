package com.primeit.digitalbank.api.cadastro.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "conta")
public class Conta {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idct;
	@Column(unique = true)
	private int conta;
	private String digito;
	private int status;
	private Timestamp dtcriacao;
	private int idusr;
	
	public Conta() {}
	
	public Conta(Integer idCt, Integer conta, String digito, Integer status, Timestamp dtCriacao, Integer idUsr) {
		this.idct = idCt;
		this.conta = conta;
		this.digito = digito;
		this.status = status;
		this.dtcriacao = dtCriacao;
		this.idusr = idUsr;
	}

	public int getId() {
		return idct;
	}

	public void setId(int idCt) {
		this.idct = idCt;
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

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Timestamp getDtCriacao() {
		return dtcriacao;
	}

	public void setDtCriacao(Timestamp dtCriacao) {
		this.dtcriacao = dtCriacao;
	}

	public int getIdUsr() {
		return idusr;
	}

	public void setIdUsr(int idUsr) {
		this.idusr = idUsr;
	}

}
