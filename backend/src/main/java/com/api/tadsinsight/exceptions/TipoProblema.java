package com.api.tadsinsight.exceptions;

public enum TipoProblema {
	
	RECURSO_NAO_ENCONTRADO("/entidade-nao-encontrada",
            "Entidade não encontrada"),
	
	ERRO_SISTEMA("/erro-de-sistema", "Erro de sistema");
	
	private String uri;
    private String title;

    TipoProblema (String path, String title){
        this.uri = "linkdoProblema.com.br" + path;
        this.title = title;
    }

	public String getUri() {
		return uri;
	}

	public String getTitle() {
		return title;
	}
    
    

}
