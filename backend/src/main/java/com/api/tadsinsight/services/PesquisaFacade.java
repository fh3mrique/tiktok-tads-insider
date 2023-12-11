package com.api.tadsinsight.services;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.api.tadsinsight.dtos.PesquisaDTO;
import com.api.tadsinsight.entities.Pesquisa;
import com.api.tadsinsight.repository.LinguagemRepository;
import com.api.tadsinsight.repository.template.PesquisaRepository;

@Service
public class PesquisaFacade {
	
	private PesquisaRepository pesquisaRepository;
	private LinguagemRepository linguagemRepository;
	
	public PesquisaFacade(PesquisaRepository pesquisaRepository, LinguagemRepository linguagemRepository) {
		this.pesquisaRepository = pesquisaRepository;
		this.linguagemRepository = linguagemRepository;
	}

	public Page<PesquisaDTO> buscarTodos(Pageable pageable){
		
		Page<Pesquisa> lista = pesquisaRepository.findAll(pageable);
		
		return lista.map(x -> new PesquisaDTO(x));
	}

	public PesquisaDTO salvar(PesquisaDTO dto) {
		
		Pesquisa entidade = new Pesquisa();
		
		entidade.setIdade(dto.getIdade());
		entidade.setNome(dto.getNome());
		
		entidade = pesquisaRepository.save(entidade);
		
		return new PesquisaDTO(entidade);
	}

}
