package com.spring4.core.hello;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.spring4.core.hello.buy.BuyWorld;
import com.spring4.core.hello.buy.BuyWorldImpl;

@Configuration
public class HelloWorldAppConfig {
	
	@Bean(name="helloBean")
	public HelloWorld helloWorld(){
		return new HelloWorldImpl();
	}
	
	@Bean(name="buyBean")
	public BuyWorld buyWorld(){
		return new BuyWorldImpl();
	}

}
