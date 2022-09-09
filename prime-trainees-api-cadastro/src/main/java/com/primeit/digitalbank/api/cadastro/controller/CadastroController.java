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
import com.primeit.digitalbank.api.cadastro.service.CadastroService;

@RestController
@RequestMapping("/cadastro")
public class CadastroController {
	@Autowired
	CadastroService cadastroService;

	@GetMapping("/{idcad}")
	public ResponseEntity<Cadastro> get(@PathVariable Integer idcad) {
		try {
			Cadastro cadastro = cadastroService.getCadastro(idcad);
			return new ResponseEntity<Cadastro>(cadastro, HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<Cadastro>(HttpStatus.NOT_FOUND);
		}
	}

	@GetMapping("/todos")
	public ResponseEntity<List<Cadastro>> getAll() {
		try {
			List<Cadastro> todosCadastros = cadastroService.getAll();
			return new ResponseEntity<List<Cadastro>>(todosCadastros, HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<List<Cadastro>>(HttpStatus.NOT_FOUND);
		}
	}

	@PostMapping("/")
	public ResponseEntity<?> add(@RequestBody Cadastro cadastro) throws Exception {
		cadastroService.saveCadastro(cadastro);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@PutMapping("/{idCad}")
	public ResponseEntity<?> update(@RequestBody Cadastro cadastro, @PathVariable Integer idCad) throws Exception {
		try {
			Cadastro existCadastro = cadastroService.getCadastro(idCad);
			cadastro.setIdcad(idCad);
			cadastroService.saveCadastro(cadastro);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

}
