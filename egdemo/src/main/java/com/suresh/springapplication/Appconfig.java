package com.suresh.springapplication;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


public class Appconfig {
	
	@Bean
	public Redmi getphone()
	{
		return new Redmi();
	}
	
	@Bean
	public Mobileprocessor getprocessor()
	{
		return new Snapdragon();
	}

}
