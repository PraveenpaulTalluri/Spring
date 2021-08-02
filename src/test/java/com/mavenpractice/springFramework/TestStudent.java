package com.mavenpractice.springFramework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStudent {
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("Student.xml");
		Student obj=(Student) context.getBean("student");
		obj.display();
	}
}
