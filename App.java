package com.tcs.SpringDemo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class App 
{
    public static void main( String[] args ) {
    	
    	ApplicationContext container=new ClassPathXmlApplicationContext("Spring.xml");//    	
    	Object object = container.getBean("person");
    	Person person=(Person)object;
    	System.out.println(person);
    	
    	((AbstractApplicationContext)container).close();
    	
    	
    	
    }
  
}
