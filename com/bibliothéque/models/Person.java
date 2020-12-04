package com.bibliothéque.models;

public class Person {

	private String firstName;
	private String lastName;
	private int age;
	
	public Person()
	{
		
	}
	public Person(String firstName, String lastName, int age) 
	{
		this.firstName =firstName;
		this.lastName =lastName;
		this.age=age;
	}
	
	public void setfirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	public String getfirstName()
	{
		return firstName;
	}
	
	public void setlastName(String lastName)
	{
		this.lastName= lastName;
	}
	
	public String getlastName()
	{
		return lastName;
	}
	
	public void setAge(int age)
	{
		this.age = age;
	}
	
	public int getAge()
	{
		return age;
	}
	
	@Override
	public String toString() 
	{
		return "firstName :"+this.firstName + "\t lastName :"+ this.lastName + "\t Age :"+ this.age +"\t";
	}
	
}
