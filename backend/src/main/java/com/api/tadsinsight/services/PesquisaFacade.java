package com.api.tadsinsight.services;

import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.api.tadsinsight.dtos.PesquisaDTO;
import com.api.tadsinsight.dtos.PesquisaInsertDTO;
import com.api.tadsinsight.entities.Linguagem;
import com.api.tadsinsight.entities.Pesquisa;
import com.api.tadsinsight.exceptions.PesquisaNaoEncontradaException;
import com.api.tadsinsight.repository.LinguagemRepository;
import com.api.tadsinsight.repository.template.PesquisaRepository;
import com.api.tadsinsight.services.EnvioEmailService.Mensagem;

@Service
public class PesquisaFacade {
	
	private PesquisaRepository pesquisaRepository;
	private LinguagemRepository linguagemRepository;
	
	
	private EnvioEmailService envioEmail;
	
	public PesquisaFacade(PesquisaRepository pesquisaRepository, LinguagemRepository linguagemRepository, EnvioEmailService envioEmail) {
		this.pesquisaRepository = pesquisaRepository;
		this.linguagemRepository = linguagemRepository;
		this.envioEmail = envioEmail;
	}

	public Page<PesquisaDTO> buscarTodos(Pageable pageable){
		
		Page<Pesquisa> lista = pesquisaRepository.findAll(pageable);
		
		return lista.map(x -> new PesquisaDTO(x));
	}

	public PesquisaInsertDTO salvar(PesquisaInsertDTO dto) {
        Pesquisa entidade = new Pesquisa();

        entidade.setIdade(dto.getIdade());
        entidade.setNome(dto.getNome());

        // Busca a Linguagem pelo ID presente no DTO
        Linguagem linguagem = dto.getLinguagemId() != null ?
                linguagemRepository.buscarPorId(dto.getLinguagemId()).orElse(null) :
                null;

        entidade.setLinguagem(linguagem);

        entidade = pesquisaRepository.save(entidade);

        
        
        Mensagem mensagem = new Mensagem("fhemrique55@gmail.com", "pesquisa cadastrada", "b");
        
        envioEmail.enviar(mensagem);
        
        return new PesquisaInsertDTO(entidade);
        
       
    }

	@Transactional(readOnly = true)
	public PesquisaDTO buscarPorId(Long id) {
		
	    Optional<Pesquisa> obj = pesquisaRepository.findById(id);
	    
	    Pesquisa entidade = obj.orElseThrow(() -> new PesquisaNaoEncontradaException("O recurso de registro dessa Pesquisa não foi encontrado"));

	    return new PesquisaDTO(entidade);
	}

}
