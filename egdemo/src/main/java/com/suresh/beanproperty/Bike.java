package com.suresh.beanproperty;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{
	
	public void drive()
	{
		System.out.println("Now you are on bike riding ");
	}

}
