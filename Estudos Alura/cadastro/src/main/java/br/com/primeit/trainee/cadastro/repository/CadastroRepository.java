package br.com.primeit.trainee.cadastro.repository;

import br.com.primeit.trainee.cadastro.model.Cadastro;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


public interface CadastroRepository  extends JpaRepository<Cadastro, Integer> {

}