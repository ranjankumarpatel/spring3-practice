package com.spring4.core.dependencyInjection;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SetterDependencyInjectionApp {

	public static void main(String[] args) {
		
		try {
			
			AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext();
			
			applicationContext.scan("bean");
			applicationContext.refresh();
			
			//Address address = applicationContext.getBean(Address.class);
			
			
			Company company = applicationContext.getBean(Company.class);
			//company.setCompanyAddress(address);
					
			//System.out.println("Address : "+address);
			
			System.out.println("Company :  "+company);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}

}
