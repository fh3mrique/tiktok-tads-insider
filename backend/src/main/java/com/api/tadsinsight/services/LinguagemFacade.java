package com.api.tadsinsight.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.api.tadsinsight.dtos.LinguagemDTO;
import com.api.tadsinsight.entities.Linguagem;
import com.api.tadsinsight.repository.LinguagemRepository;

@Service
public class LinguagemFacade {
	
	private LinguagemRepository linguagemRepository;
	
	public LinguagemFacade(LinguagemRepository linguagemRepository) {
		this.linguagemRepository = linguagemRepository;
	}
	
	public List<LinguagemDTO> buscarTodos () {
	    List<Linguagem> list = linguagemRepository.buscarTodos();
	    
	    return list.stream().map(x -> new LinguagemDTO(x)).collect(Collectors.toList());
	}
}
