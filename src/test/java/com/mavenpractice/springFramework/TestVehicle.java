package com.mavenpractice.springFramework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mavenpractice.springFramework.Vehicle;

public class TestVehicle {
	public static void main(String[] args) {
		 ApplicationContext context=new ClassPathXmlApplicationContext("vehicle.xml"); 
		    
			Vehicle obj=(Vehicle) context.getBean("vehicle");
			obj.motion();
			
	}
   
}
