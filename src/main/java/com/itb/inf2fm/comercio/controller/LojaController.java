package com.itb.inf2fm.comercio.controller;

import org.springframework.stereotype.Controller;

import java.util.Arraylist;

@Controller
@RequestMapping("/comercio/produtos")
public class LojaController {
	
	@GetMapping("/listar")
	public String listarProdutos() {
		
		Produto p1 = new Produto();
		
		p1.setNome("Máquina de lavar Brastemp 15l");
		p1.setCodigoBarras("145JIFJFUDE212456");
		p1.setDescricao("Produto Linha Branca com painel digital");
		p1.setPreco(3215.89);
		
		Produto p2 = new Produto();
		
		p2.setId(201);
		p2.setNome("Televisor 70");
		p2.setCodigoBarras("TLERD44487114454");
		p2.setDescricao("Televisor Tela Plana let Samsung");
		p2.setPreco(6326.12);
		
		// Adicionando os produtos à lista
		
		listaDeProdutos.add(p1);
		listaDeProdutos.add(p2);
		
		return "produtos";
		
	}
}
