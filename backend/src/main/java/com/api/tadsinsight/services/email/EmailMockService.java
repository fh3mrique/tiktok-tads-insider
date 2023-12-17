package com.api.tadsinsight.services.email;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.api.tadsinsight.services.EnvioEmailService;

public class EmailMockService implements EnvioEmailService  {
	
	private static Logger LOG = LoggerFactory.getLogger(EmailMockService.class);

	@Override
	public void enviar(Mensagem mensagem) {
		LOG.info("EMAIL MOCADO ENVIADO PARA O PERFIL DE TESTE");
	}
	

}
