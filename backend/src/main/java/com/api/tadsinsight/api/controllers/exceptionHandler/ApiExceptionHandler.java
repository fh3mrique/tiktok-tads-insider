package com.api.tadsinsight.api.controllers.exceptionHandler;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.api.tadsinsight.exceptions.PesquisaNaoEncontradaException;
import com.api.tadsinsight.exceptions.Problema;
import com.api.tadsinsight.exceptions.TipoProblema;

@ControllerAdvice
public class ApiExceptionHandler extends ResponseEntityExceptionHandler{
	
	 @ExceptionHandler(PesquisaNaoEncontradaException.class)
	    public ResponseEntity<?> handleEntidadeNaoEncontradaException
	            (PesquisaNaoEncontradaException ex, WebRequest request){
		 
		 HttpStatus status = HttpStatus.NOT_FOUND;
		 TipoProblema tipoProblema = TipoProblema.RECURSO_NAO_ENCONTRADO;
		 String detail = ex.getMessage();
		 
		 Problema problema = Problema.builder()
				 			.status(status.value())
				 			.type(tipoProblema.getUri())
				 			.title("Entidade não encontrada")
				 			.detail(detail)
				 			.build();
		 
		 return handleExceptionInternal(ex, problema, new HttpHeaders(),
	                status, request);
		 
	 }
	 
	 @ExceptionHandler(Exception.class)
	    public ResponseEntity<Object> handleUncaught(Exception ex, WebRequest request){
	        HttpStatus status = HttpStatus.INTERNAL_SERVER_ERROR;
	        TipoProblema tipoProblema = TipoProblema.ERRO_SISTEMA;
	        String detail = "Ocorreu um erro interno inesperado no sistema. "
	                + "Tente novamente e se o problema persistir, entre em contato "
	                + "com o administrador do sistema.";

	        Problema problema = Problema.builder()
		 			.status(status.value())
		 			.type(tipoProblema.getUri())
		 			.title("Entidade não encontrada")
		 			.detail(detail)
		 			.build();
 
	        return handleExceptionInternal(ex, problema, new HttpHeaders(),
            status, request);
	        
	    }
	 
	
	 protected ResponseEntity<Object> handleExceptionInternal
	            (Exception ex, Object body, HttpHeaders headers, HttpStatus status, WebRequest request) {

	        if (body == null){
	            body =  Problema.builder()
	                    .title(status.getReasonPhrase())
	                    .status(status.value())
	                    .build();
	        }
	        else if (body instanceof String){
	            body =  Problema.builder()
	                    .title((String) body)
	                    .build();
	        }
	        return super.handleExceptionInternal(ex, body, headers, status, request);
	    }

}
