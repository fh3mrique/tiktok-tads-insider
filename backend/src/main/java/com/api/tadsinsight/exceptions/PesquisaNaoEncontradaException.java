package com.api.tadsinsight.exceptions;

public class PesquisaNaoEncontradaException extends RuntimeException{

	private static final long serialVersionUID = 1L;
	
	public PesquisaNaoEncontradaException(String msg) {
		super(msg);
	}

}
