package com.springcore.SpringScope;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class AppDemo 
{
    public static void main( String[] args ) {
    
    		System.out.println("main method......");
    	
    		ApplicationContext ac=new ClassPathXmlApplicationContext("bean.xml");
    		
    		Employee e1=(Employee)ac.getBean("employee");
    		System.out.println("details of first employee....");
    		
    		System.out.println("employee id is:"+e1.getId());
    		System.out.println("employee name is:"+e1.getName());
    		System.out.println("employee name is:"+e1.getCity()+"\n");
    		
    		
    		Employee e2=ac.getBean("employee",Employee.class);
    		System.out.println("details of Second employee....");
   		
    		System.out.println("employee id is:"+e2.getId());
    		System.out.println("employee name is:"+e2.getName());
    		System.out.println("employee name is:"+e2.getCity()+"\n");
    		
    		System.out.println("hashcode of e1 is="+e1.hashCode());
    		System.out.println("hashcode of e2 is="+e2.hashCode());




    
    
    }
}
