package com.primeit.digitalbank.api.cadastro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.primeit.digitalbank.api.cadastro.model.OutraConta;
import com.primeit.digitalbank.api.cadastro.service.OutraContaService;

@RestController
@RequestMapping("/outraconta")
public class OutraContaController {
	
	@Autowired
	private OutraContaService outraContaService;
	
	@GetMapping("/{idCad}")
	public ResponseEntity<OutraConta> getByIdcad(@PathVariable Integer idCad){
		try {
			OutraConta outraConta = outraContaService.getByIdCad(idCad);
			System.out.println(outraConta);
			return new ResponseEntity<OutraConta>(outraConta, HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<OutraConta>(HttpStatus.NOT_FOUND);
		}
	}
	
	@GetMapping("/")
	public ResponseEntity<List<OutraConta>> getAllOutraConta(){
		try {
			List<OutraConta> contas = outraContaService.getAll();
			System.out.println(contas.toString());
			return new ResponseEntity<List<OutraConta>>(contas, HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<List<OutraConta>>(HttpStatus.NOT_FOUND);
		}
	}
	
	@PostMapping("/")
	public void add(@RequestBody OutraConta outraConta) {
		System.out.println(outraConta);
		outraContaService.salvarOutraConta(outraConta);
	}

}
