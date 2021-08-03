package com.mavenpractice.springFramework;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{
	public void motion()
	{
		System.out.println("wheely..!");
	}

}
