package com.primeit.digitalbank.api.cadastro.service;

import com.primeit.digitalbank.api.cadastro.repository.CadastroRepository;
import com.primeit.digitalbank.api.cadastro.model.Cadastro;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class CadastroService {

	@Autowired(required = true)
	private CadastroRepository cadastroRepository;

	public List<Cadastro> getAll() {
		return cadastroRepository.findAll();
	}

	// [TR2208-0007] API Cadastro: chamada da verificação se cliente já existe no
	// Banco de Dados
	public Boolean verificaUsuarioExistente(String cpf, String email, String telefone) {
		long contagem = cadastroRepository.contagemOcorrenciaUsuario(cpf, email, telefone);
		if (contagem >= 1) {
			return true;
		} else {
			return false;
		}
	}

	// [TR2208-0008] API Cadastro: chamada para gravar dados iniciais no Banco de
	// Dados
	public Cadastro saveCadastro(Cadastro cadastro) throws Exception {
		var usuarioExistente = verificaUsuarioExistente(cadastro.getCpf(), cadastro.getEmail(), cadastro.getTelefone());
		try {
			if (usuarioExistente == false) {
				cadastro = cadastroRepository.save(cadastro);
			} else {
				throw new Exception("usuário já cadastrado");
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
			throw new Exception("usuário já cadastrado");
		}

		return cadastro;
	}

	public Cadastro getCadastro(Integer idcad) {
		return cadastroRepository.findById(idcad).get();
	}
}
