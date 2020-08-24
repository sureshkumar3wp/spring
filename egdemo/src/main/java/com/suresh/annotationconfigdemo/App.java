package com.suresh.annotationconfigdemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("Annoconfig.xml");
       
       Vehicle obj = (Vehicle)context.getBean("bike");
       obj.drive();
    }
}
