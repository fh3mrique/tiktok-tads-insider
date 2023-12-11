package com.api.tadsinsight.dtos;

import java.io.Serializable;

import com.api.tadsinsight.entities.Pesquisa;

public class PesquisaDTO  implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nome;
	private Integer idade;
	
	private String linguagemFavorita;
	
	public PesquisaDTO () {
		
	}

	public PesquisaDTO(Long id, String nome, Integer idade, String linguagemFavorita) {
		this.id = id;
		this.nome = nome;
		this.idade = idade;
		this.linguagemFavorita = linguagemFavorita;
	}
	
	public PesquisaDTO(Pesquisa entidade) {
		this.id = entidade.getId();
		this.nome = entidade.getNome();
		this.idade = entidade.getIdade();
		this.linguagemFavorita = entidade.getLinguagem().getNome();
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

	public String getLinguagemFavorita() {
		return linguagemFavorita;
	}

	public void setLinguagemFavorita(String linguagemFavorita) {
		this.linguagemFavorita = linguagemFavorita;
	}
}
