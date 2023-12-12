package com.api.tadsinsight.infra;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("tadsinsider.email")
public class EmailProperties {
	
	

}
