package com.primeit.digitalbank.api.cadastro.repository;

import com.primeit.digitalbank.api.cadastro.model.Cadastro;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CadastroRepository extends JpaRepository<Cadastro, Integer> {

    // Native Query
    @Query(value = "SELECT COUNT(*) FROM cadastro WHERE cpf = ? AND email = ? AND telefone = ?;", nativeQuery = true)
    public long contagemOcorrenciaUsuario(String cpf, String email, String telefone);

    // Method Query
    public long countByCpfOrEmailOrTelefone(String cpf, String email, String telefone);

}