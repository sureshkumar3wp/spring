package com.suresh.autowiredannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.suresh.constructorinjection.Tyre;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("Autowired.xml");
       
     Car obj = (Car)context.getBean("car");
       obj.drive();
       
     
    }
}
