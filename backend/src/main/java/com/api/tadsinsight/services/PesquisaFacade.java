package com.api.tadsinsight.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.api.tadsinsight.dtos.PesquisaDTO;
import com.api.tadsinsight.entities.Pesquisa;
import com.api.tadsinsight.repository.template.PesquisaRepository;

@Service
public class PesquisaFacade {
	
	private PesquisaRepository pesquisaRepository;
	
	public PesquisaFacade(PesquisaRepository pesquisaRepository) {
		this.pesquisaRepository = pesquisaRepository;
	}

	public Page<PesquisaDTO> buscarTodos(Pageable pageable){
		
		Page<Pesquisa> lista = pesquisaRepository.findAll(pageable);
		
		return lista.map(x -> new PesquisaDTO(x));
	}

	public void salvar() {
		
		
		
	}

}
