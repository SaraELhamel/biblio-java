package com.bibliothéque.models;

public class Employee extends Person {
	
	private int salary;
	
	public Employee()
	{
		
	}
	
	public Employee(String firstName, String lastName, int age, int salary ) {
		super(firstName, lastName, age);
		this.salary = salary;
	}
	
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString()
	{
		return super.toString() + "\t Salary : "+ this.salary;
	}
}