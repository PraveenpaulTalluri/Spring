package com.mavenpractice.springFramework;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{
	public void motion()
	{
		System.out.println("Its working..!");
	}

}
