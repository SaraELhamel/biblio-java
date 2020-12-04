package com.bibliothéque.models;

public class Student extends Person {

	private int matricule;
	
	//Constructors 
	public Student(String firstName, String lastName, int age, int matricule ) {
		super(firstName, lastName, age);
		this.matricule= matricule;
	}
	
	public Student(Person p, int matricule ) {
		super(p.getfirstName(), p.getlastName(), p.getAge());
		this.matricule= matricule;
	}

	public Student() {
		// TODO Auto-generated constructor stub
	}

	//Getters & setters
	public int getMatricule() {
		return matricule;
	}
	
	public void setMatricule(int matricule) {
		this.matricule = matricule;
	}

	@Override
	public String toString()
	{
		return super.toString() + "\t Matricule : "+ this.matricule;
	}
}

