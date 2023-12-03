package com.api.tadsinsight.dtos;

import java.io.Serializable;

import com.api.tadsinsight.entities.Linguagem;

public class LinguagemDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nome;
	
	public LinguagemDTO() {
		
	}
	
	public LinguagemDTO(Long id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public LinguagemDTO(Linguagem entidade) {
		this.id = entidade.getId();
		this.nome = entidade.getNome();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
}
