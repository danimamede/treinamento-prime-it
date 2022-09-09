package br.com.primeit.trainee.cadastro.controller;

import br.com.primeit.trainee.cadastro.model.Cadastro;
import br.com.primeit.trainee.cadastro.repository.CadastroRepository;
import br.com.primeit.trainee.cadastro.service.CadastroService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

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
	
	@PostMapping("/")
	public ResponseEntity<?> add(@RequestBody Cadastro cadastro) {
		try {
			cadastroService.saveCadastro(cadastro);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
	}
	
	@PutMapping("/{idCad}")
	public ResponseEntity<?> update(@RequestBody Cadastro cadastro, @PathVariable Integer idCad) {
		try {
			Cadastro existCadastro = cadastroService.getCadastro(idCad);
			cadastro.setId(idCad);
			cadastroService.saveCadastro(cadastro);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (NoSuchElementException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}