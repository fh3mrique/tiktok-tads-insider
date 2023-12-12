package com.api.tadsinsight.services;

public interface EnvioEmailService {
	
	void enviar(Mensagem mensagem);
	

	public class Mensagem {
		private String destinatario;
		private String assunto;
		private String corpo;
		
		
		public Mensagem(String destinatario, String assunto, String corpo) {
			this.destinatario = destinatario;
			this.assunto = assunto;
			this.corpo = corpo;
		}


		public String getDestinatario() {
			return destinatario;
		}


		public void setDestinatario(String destinatario) {
			this.destinatario = destinatario;
		}


		public String getAssunto() {
			return assunto;
		}


		public void setAssunto(String assunto) {
			this.assunto = assunto;
		}


		public String getCorpo() {
			return corpo;
		}


		public void setCorpo(String corpo) {
			this.corpo = corpo;
		}
		
		
		
		
	}

}
