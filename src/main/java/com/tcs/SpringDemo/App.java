package com.tcs.SpringDemo;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;

public class App 
{
    public static void main( String[] args )
    {
    	DefaultListableBeanFactory container = new DefaultListableBeanFactory();
    	XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(container);
    	reader.loadBeanDefinitions("Spring.xml");
    	
//    	Object object = container.getBean("person");
//    	Person person= (Person) object;
    	
//    	Person person=(Person)container.getBean("person");

//    	Address address=(Address)container.getBean("address");
//    	address.show();

//    	Person person = container.getBean(Person.class);
    	
    	Person person = container.getBean("person", Person.class);
    	
    	person.display();
    	
    	
    	
    }
}
