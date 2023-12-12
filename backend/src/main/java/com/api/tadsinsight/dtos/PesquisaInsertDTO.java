package com.api.tadsinsight.dtos;

import java.io.Serializable;

import com.api.tadsinsight.entities.Pesquisa;

public class PesquisaInsertDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nome;
	private Integer idade;
	private Long linguagemId;
	
	public PesquisaInsertDTO() {
		
	}
	
	public PesquisaInsertDTO(Long id, String nome, Integer idade, Long linguagemId) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.linguagemId = linguagemId;
	}
	
	public PesquisaInsertDTO(Pesquisa entidade) {
		this.id = entidade.getId();
		this.nome = entidade.getNome();
		this.idade = entidade.getIdade();
		this.linguagemId = entidade.getLinguagem().getId();
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

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Long getLinguagemId() {
		return linguagemId;
	}

	public void setLinguagemId(Long linguagemId) {
		this.linguagemId = linguagemId;
	}

	
	
}
