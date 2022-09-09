package br.com.primeit.trainee.cadastro.model;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "cadastro")
public class Cadastro {
	
	private int idCad;
	private String cpf;
	private String senha;
	private int status;
	private String nome;
	private String sobreNome;
	private Timestamp dtNasc;
	private String telefone;
	private String email;
	private Timestamp dtCriacao;
	private int idUsr;
	
	public Cadastro() {
		
	}
	
	public Cadastro(int idCad, String cpf, String senha, int status, String nome, String sobreNome, Timestamp dtNasc, String telefone, String email, Timestamp dtCriacao, int idUsr) {
		this.idCad = idCad;
		this.cpf = cpf;
		this.senha = senha;
		this.status = status;
		this.nome = nome;
		this.sobreNome = sobreNome;
		this.dtNasc = dtNasc;
		this.telefone = telefone;
		this.email = email;
		this.dtCriacao = dtCriacao;
		this.idUsr = idUsr;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int getId() {
		return idCad;
	}

	public void setId(Integer idCad) {
		// TODO Auto-generated method stub
		this.idCad = idCad;
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
	
	public void setStatus(Integer status) {
		this.status = status;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getSobrenome() {
		return sobreNome;
	}
	
	public void setSobrenome(String sobreNome) {
		this.sobreNome = sobreNome;
	}
	
	public Timestamp getDtNasc() {
		return dtNasc;
	}
	
	public void setDtNasc(Timestamp dtNasc) {
		this.dtNasc = dtNasc;
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
	
	public Timestamp getDtCriacao() {
		return dtCriacao;
	}
	
	public void setDtCriacao(Timestamp dtCriacao) {
		this.dtCriacao = dtCriacao;
	}
	
	public Integer getIdUsr() {
		return idUsr;
	}
	
	public void setIdUsr(Integer idUsr) {
		this.idUsr = idUsr;
	}
	
}
