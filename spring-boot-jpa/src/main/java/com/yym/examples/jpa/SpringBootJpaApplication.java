package com.yym.examples.jpa;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootJpaApplication {

	private static Logger logger = LoggerFactory.getLogger(SpringBootJpaApplication.class);

	@Value("${spring.datasource.url}")
	private String url;

	@Value("${spring.datasource.username}")
	private String username;

	@Value("${spring.datasource.password}")
	private String pass;

	@Value("${spring.datasource.driver-class-name}")
	private String driverClassName;

	@Bean
	public String print(){
		logger.warn(url + "  " + username + "  " + pass + "  " + driverClassName);
		return username;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringBootJpaApplication.class, args);
	}
}
