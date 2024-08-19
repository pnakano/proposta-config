package com.pamelanakano.proposta_config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class PropostaConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(PropostaConfigApplication.class, args);
	}

}
