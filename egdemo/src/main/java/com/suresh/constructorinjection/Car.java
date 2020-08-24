package com.suresh.constructorinjection;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle {
	public void drive()
	{
		System.out.println("Now you are on Car Riding");
	}

}
