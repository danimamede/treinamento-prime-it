package com.primeit.digitalbank.api.cadastro.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.primeit.digitalbank.api.cadastro.model.OutraConta;
import com.primeit.digitalbank.api.cadastro.repository.OutraContaRepository;

@Service
@Transactional
public class OutraContaService {
	
	
	@Autowired
	private OutraContaRepository repository;
	
	public OutraConta getById(Integer id) {
		return repository.findById(id).get();
	}
	
	public OutraConta getByIdCad(Integer idCad) {
		return repository.findByIdcad(idCad);
	}
	
	public List<OutraConta> getAll(){
		return repository.findAll();
	}

	public void salvarOutraConta(OutraConta conta) {
		repository.save(conta);
	}
}
