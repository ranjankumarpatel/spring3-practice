package com.spring4.core.hello;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring4.core.hello.buy.BuyWorld;

public class HelloWorldApp {

	public static void main(String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(HelloWorldAppConfig.class);
		HelloWorld helloWorld = (HelloWorld) applicationContext.getBean("helloBean");
		helloWorld.printHelloWorld();

		BuyWorld buyWorld = (BuyWorld) applicationContext.getBean("buyBean");
		buyWorld.printBuyWorld();
	}

}
