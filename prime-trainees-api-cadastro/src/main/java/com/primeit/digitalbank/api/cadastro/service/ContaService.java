package com.primeit.digitalbank.api.cadastro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.primeit.digitalbank.api.cadastro.model.Conta;
import com.primeit.digitalbank.api.cadastro.repository.ContaRepository;

@Service
@Transactional
public class ContaService {
	
	@Autowired(required = true)
	private ContaRepository contaRepository;
	
	public void salvarConta(Conta conta) {
		contaRepository.save(conta);
	}
	
	public List<Conta> getAll() {
		return contaRepository.findAll();
	}

	public Conta getConta(Integer idCt) {
		return contaRepository.findByIdct(idCt);
	}

}
