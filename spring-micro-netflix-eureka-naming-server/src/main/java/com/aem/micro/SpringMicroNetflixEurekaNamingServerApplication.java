package com.aem.micro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class SpringMicroNetflixEurekaNamingServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMicroNetflixEurekaNamingServerApplication.class, args);
	}

}
