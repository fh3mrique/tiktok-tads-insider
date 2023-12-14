package com.api.tadsinsight.api.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.tadsinsight.dtos.PesquisaDTO;
import com.api.tadsinsight.dtos.PesquisaInsertDTO;
import com.api.tadsinsight.services.PesquisaFacade;

@RestController
@RequestMapping("/pesquisa")
public class PesquisaController {
	
	@Autowired
	private PesquisaFacade pesquisaFacade;

	@GetMapping
	public ResponseEntity<Page<PesquisaDTO>> buscarTodos (Pageable pageable){
		
		Page<PesquisaDTO> pagina = pesquisaFacade.buscarTodos(pageable);
		
		return ResponseEntity.ok().body(pagina);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<PesquisaDTO> buscarPorId (@PathVariable Long id){
		
		PesquisaDTO registro = pesquisaFacade.buscarPorId(id);
		
		return ResponseEntity.ok().body(registro);	
	}
	
	@PostMapping
	public ResponseEntity<PesquisaInsertDTO> salvar (@RequestBody PesquisaInsertDTO body) {
		
		PesquisaInsertDTO dto = pesquisaFacade.salvar(body);
		
		return ResponseEntity.status(HttpStatus.CREATED).body(dto);	
	}
	
	
}
