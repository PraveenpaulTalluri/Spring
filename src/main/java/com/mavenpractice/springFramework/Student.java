package com.mavenpractice.springFramework;

public class Student {
	int id;
	String name;
	
	
	public Student(String name) {
		super();
		this.name = name;
	}
	public Student(int id) {
		super();
		this.id = id;
	}
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public void display()
	{
		System.out.println("id: "+id+" Name: "+name);
	}
	
}
