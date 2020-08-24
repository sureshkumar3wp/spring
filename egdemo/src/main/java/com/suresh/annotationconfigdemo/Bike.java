package com.suresh.annotationconfigdemo;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{
	
	public void drive()
	{
		System.out.println("Now you are on bike riding ");
	}

}
