package com.finalfds.cidareira;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
@ComponentScan(basePackages = { "com.finalfds" })
@EntityScan(basePackages = { "com.finalfds" })
public class CidareiraApplication {

	public static void main(String[] args) {
		SpringApplication.run(CidareiraApplication.class, args);
	}

}
