package com.api.tadsinsight.services;

import java.io.Console;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import jakarta.mail.internet.MimeMessage;

@Service
public class SmtpEnvioEmailService implements EnvioEmailService {

	@Autowired
	private JavaMailSender mailSender;
	
	
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
	}
	
	

}
