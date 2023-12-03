package com.api.tadsinsight.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.tadsinsight.dtos.LinguagemDTO;
import com.api.tadsinsight.services.LinguagemFacade;

@RestController
@RequestMapping("/linguagem")
public class LinguagemController {
	
	@Autowired
	private LinguagemFacade linguagemFacade;

	@GetMapping
	public List<LinguagemDTO> buscarTodos (){
		return linguagemFacade.buscarTodos();
	}

}
