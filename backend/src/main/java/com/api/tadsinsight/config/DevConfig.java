package com.api.tadsinsight.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.api.tadsinsight.services.EnvioEmailService;
import com.api.tadsinsight.services.email.SmtpEnvioEmailService;

@Configuration
@Profile("dev")
public class DevConfig {

	@Bean
	public EnvioEmailService envioEmailService() {
		return new SmtpEnvioEmailService();
	}
}
