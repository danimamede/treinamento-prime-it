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
@RequestMapping("/")
public class HelloController {
	
	@GetMapping()
	public ResponseEntity<String> getHello() {
		return new ResponseEntity<String>(HttpStatus.OK).ok().body("Só testando <3");
	}
	
}