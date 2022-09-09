package br.com.primeit.trainee.cadastro.service;

import br.com.primeit.trainee.cadastro.model.Cadastro;

import br.com.primeit.trainee.cadastro.repository.CadastroRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class CadastroService {
	
	@Autowired
	private CadastroRepository cadastroRepository;
	
	public void saveCadastro(Cadastro cadastro) {
		cadastroRepository.save(cadastro);
	}
	
	public Cadastro getCadastro(Integer idCad) {
		return cadastroRepository.findById(idCad).get();
	}
	
}