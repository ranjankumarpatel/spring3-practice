package com.springdi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDISetterConstructorApp {

	public static void main(String[] args) {
		
		
		ApplicationContext applicationContextConstruct = new ClassPathXmlApplicationContext("applicationContextDIConstruct.xml");
		Address address2 = (Address) applicationContextConstruct.getBean("address2");
		
		System.out.println("Address : "+address2);

	}

}
