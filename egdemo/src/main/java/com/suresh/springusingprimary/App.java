package com.suresh.springusingprimary;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext factory = new AnnotationConfigApplicationContext(Appconfig.class);
		
		Redmi x2= factory.getBean(Redmi.class);
		x2.config();

	}

}
