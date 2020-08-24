package com.suresh.springusingprimary;

import org.springframework.stereotype.Component;

@Component
public class Snapdragon implements Mobileprocessor {

	@Override
	public void process() {
	
         System.out.println("World Best CPU");
	}

}
