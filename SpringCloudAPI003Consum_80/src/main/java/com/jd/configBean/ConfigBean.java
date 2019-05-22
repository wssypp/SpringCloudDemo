package com.jd.configBean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {

	@Bean
	public RestTemplate getTemplate(){
		return new RestTemplate();
	}
}
