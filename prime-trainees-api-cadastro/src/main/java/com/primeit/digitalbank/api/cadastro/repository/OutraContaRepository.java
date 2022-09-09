package com.primeit.digitalbank.api.cadastro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.primeit.digitalbank.api.cadastro.model.OutraConta;

public interface OutraContaRepository extends JpaRepository<OutraConta, Integer> {

    OutraConta findByIdcad(Integer idcad);
}
