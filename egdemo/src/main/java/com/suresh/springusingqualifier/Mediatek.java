package com.suresh.springusingqualifier;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component

public class Mediatek implements Mobileprocessor {

	@Override
	public void process() {
		// TODO Auto-generated method stub
		System.out.println("2 nd best cpu");

	}

}
