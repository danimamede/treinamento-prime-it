package com.primeit.digitalbank.api.cadastro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.primeit.digitalbank.api.cadastro.model.Conta;

public interface ContaRepository extends JpaRepository<Conta, Integer> {
	
	Conta findByIdct(Integer idct);
}
