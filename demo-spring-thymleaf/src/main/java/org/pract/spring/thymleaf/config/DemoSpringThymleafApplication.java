package org.pract.spring.thymleaf.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = { "org.pract.spring.thymleaf" })
@EnableAutoConfiguration
@SpringBootApplication
public class DemoSpringThymleafApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoSpringThymleafApplication.class, args);
	}
}
