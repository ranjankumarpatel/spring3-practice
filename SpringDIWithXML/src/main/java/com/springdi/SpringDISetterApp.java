package com.springdi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDISetterApp {

	public static void main(String[] args) {
		
		ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContextDI.xml");
		
		Address address1 = (Address) applicationContext.getBean("address1");
		
		System.out.println("Address : "+address1);
		
		

	}

}
