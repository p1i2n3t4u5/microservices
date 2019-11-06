package com.aem.micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SpringMicroConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMicroConfigServerApplication.class, args);
	}

}
