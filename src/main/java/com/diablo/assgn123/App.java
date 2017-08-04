package com.diablo.assgn123;

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
    	ApplicationContext  context = new ClassPathXmlApplicationContext("spring.xml");
		Student student = (Student)context.getBean("person");
		StudentType stype = student.getType();
		System.out.println(stype.getTypeName());
    }
}
