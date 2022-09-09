package com.primeit.digitalbank.api.cadastro.controller;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.primeit.digitalbank.api.cadastro.model.Cadastro;
import com.primeit.digitalbank.api.cadastro.model.Conta;
import com.primeit.digitalbank.api.cadastro.service.ContaService;

@RestController
@RequestMapping("/conta")
public class ContaController {
	
	@Autowired
	private ContaService contaService;
	
	@GetMapping("/{idCt}")
	public ResponseEntity<Conta> getConta(@PathVariable Integer idCt){
		try {
			Conta conta = contaService.getConta(idCt);
			return new ResponseEntity<Conta>(conta, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<Conta>(HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/")
	public ResponseEntity<List<Conta>> getAll(){
		try {
			List<Conta> contas = contaService.getAll();
			return new ResponseEntity<List<Conta>>(contas, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<List<Conta>>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/")
	public void add(@RequestBody Conta conta) {
		contaService.salvarConta(conta);
	}
	
	@PutMapping("/{idCt}")
	public ResponseEntity<?> update(@RequestBody Conta conta, @PathVariable Integer idCt) {
		try {
			Conta existConta = contaService.getConta(idCt);
			conta.setId(idCt);
			contaService.salvarConta(conta);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

}
