package com.primeit.digitalbank.api.cadastro.model;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cadastro")
public class Cadastro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idcad;
	private String cpf;
	private String senha;
	private int status;
	private String nome;
	private String sobrenome;
	private Timestamp dtnasc;
	private String telefone;
	private String email;
	private Timestamp dtcriacao;
	private int idusr;

	@Column(columnDefinition = "integer default 0")
	private int id;

	public Cadastro() {

	}

	public Cadastro(int idcad, String cpf, String senha, int status, String nome, String sobrenome, Timestamp dtnasc,
			String telefone, String email, Timestamp dtcriacao, int idusr) {
		this.idcad = idcad;
		this.cpf = cpf;
		this.senha = senha;
		this.status = status;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.dtnasc = dtnasc;
		this.telefone = telefone;
		this.email = email;
		this.dtcriacao = dtcriacao;
		this.idusr = idusr;
	}

	public int getIdcad() {
		return idcad;
	}

	public void setIdcad(int idcad) {
		this.idcad = idcad;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public Timestamp getDtnasc() {
		return dtnasc;
	}

	public void setDtnasc(Timestamp dtnasc) {
		this.dtnasc = dtnasc;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Timestamp getDtcriacao() {
		return dtcriacao;
	}

	public void setDtcriacao(Timestamp dtcriacao) {
		this.dtcriacao = dtcriacao;
	}

	public int getIdusr() {
		return idusr;
	}

	public void setIdusr(int idusr) {
		this.idusr = idusr;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

}