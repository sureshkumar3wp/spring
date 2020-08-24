package com.suresh.springapp1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Redmi {
	
	@Autowired
	Mobileprocessor cpu;
	
	
	public Mobileprocessor getCpu() {
		return cpu;
	}


	public void setCpu(Mobileprocessor cpu) {
		this.cpu = cpu;
	}


	public void config()
	{
		System.out.println("Octa- core,6 gb ram,64 MP camera");
		cpu.process();
	}

}
