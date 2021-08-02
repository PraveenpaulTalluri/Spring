package com.mavenpractice.springFramework;

public class Employee {
	int id;
	String name;
	Address address;
	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	void display()
	{
		System.out.println("Id:"+id+" Name:"+name);
		System.out.println("Address:"+address.toString());
	}

}
