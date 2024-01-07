package com.twg.setterinjection;

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
       //create a spring container
        ApplicationContext context = new ClassPathXmlApplicationContext("com/twg/setterinjection/configmetadata.xml");

        Customer customer  = (Customer) context.getBean("cus");
        System.out.println("Name:"+customer.getName());
        System.out.println("Name:"+customer.getContact());
        System.out.println("Name:"+customer.getAddress());
    }
}
