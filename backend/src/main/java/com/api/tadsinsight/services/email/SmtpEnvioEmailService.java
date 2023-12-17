package com.api.tadsinsight.services.email;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;

import com.api.tadsinsight.services.EnvioEmailService;

import jakarta.mail.internet.MimeMessage;

public class SmtpEnvioEmailService implements EnvioEmailService {

	@Autowired
	private JavaMailSender mailSender;
	private static Logger LOG = LoggerFactory.getLogger(EmailMockService.class);
	
	@Override
	public void enviar(Mensagem mensagem) {
		
		
		try {
			MimeMessage mimeMessage = mailSender.createMimeMessage();
			
			MimeMessageHelper helper = new MimeMessageHelper(mimeMessage, "UTF-8");
			helper.setFrom("<naoresponder@tadsinsider.com.br>");
			helper.setTo(mensagem.getDestinatario());
			helper.setSubject(mensagem.getAssunto());
			helper.setText(mensagem.getCorpo(), true);
		}
		catch (Exception e) {
			System.out.println("ERRRO");
		}
		
		LOG.info("EMAIL REAL ENVIADO PARA O " + mensagem.getDestinatario());
	}
	
	

}
