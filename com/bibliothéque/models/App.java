package com.bibliothéque.models;


import java.util.Scanner;
import java.util.ArrayList;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Person personne1 = new Person("El Hamel","Sara",25);
		Person personne2 = new Person("El hamdi","salima",23);
		
		Student etudiant1 = new Student(personne1,10600300);
		Student etudiant2 = new Student(personne2,98900300);
		
		Book book1 = new Book("La clé du bonheur  ", "Danielle Steel", 270);
		
		
		Employee employee1 = new Employee("salmi", "hicham", 40, 34000);
		Employee employee2 = new Employee("Falki", "Tarik", 50, 21000);

		ArrayList<Student> listStudents = new ArrayList<Student>();
		ArrayList<Employee> listEmployees = new ArrayList<Employee>();
		ArrayList<Book> listBooks = new ArrayList<Book>();
		
		
		listStudents.add(etudiant1);
		listStudents.add(etudiant2);
		
		listBooks.add(book1);
		
		
		listEmployees.add(employee1);
		
		
		while(true) {
		Scanner reader = new Scanner(System.in);
	    System.out.print("Manage students, employees, or books? (s/e/b) : ");
	    char choice = reader.next().charAt(0);
	   
	 
		switch (choice) {
	      case 's':
	    	  System.out.println("Student list :");
	    	  //show students :
	    	  for(int i=0; i<listStudents.size() ;i++)
	    	  {
	    		  System.out.println("\t The student "+ (i+1) +":");
	    		  System.out.println(listStudents.get(i).toString());
	    	  }
 			  System.out.println("Add, update or delete ? (a/u/d) :");
 			  char choice2 = reader.next().charAt(0);
 			  switch(choice2)
 			  {
	 			  case 'a' : 
	 				 Student student1 = new Student();
		 			 System.out.println("New student : ");
		 			 System.out.println("Enter first name : ");
		 			 student1.setfirstName(reader.next()) ;
		 			 System.out.println("enter last name : ");
		 			 student1.setlastName(reader.next()) ;
		 			 System.out.println("enter age: ");
		 			 student1.setAge(reader.nextInt()) ;
		 			 System.out.println("enter  matricule: ");
		 			 student1.setMatricule(reader.nextInt()) ;
		 			 listStudents.add(student1);
	 			  	break;
	 			  	
		      	  case 'u' : 
		      		for (int i = 0; i < listStudents.size(); i++) 
					{
						System.out.println(listStudents.get(i).toString()); 
					}
		 			 System.out.println("Update student : ");
		 			 System.out.println("Enter student index : ");
		 			 int id1 = reader.nextInt();
		 			 System.out.println("EntEr the new first name : ");
		 			 listStudents.get(id1).setfirstName(reader.next()) ;
		 			 System.out.println("enter the new last name: ");
		 			 listStudents.get(id1).setlastName(reader.next()) ;
		 			 System.out.println("enter the new  age: ");
		 			 listStudents.get(id1).setAge(reader.nextInt()) ;
		 			 System.out.println("enter  the matricule: ");
		 			 listStudents.get(id1).setMatricule(reader.nextInt()) ;
		 			 System.out.println(listStudents.get(id1).toString());
				  	break;
				  	
				  case 'd' : 
						for (int i = 0; i < listStudents.size(); i++) 
						{
							System.out.println(listStudents.get(i).toString()); 
						}
						System.out.println("Entrez l'index de l'etudiant : ");
						int id2 = reader.nextInt();
						listStudents.remove(id2);
						System.out.println("Etudiant supprim�");
				  	break;
				}
		      break;  
	      case 'e':
	    	  System.out.println("Employees list :");
	    	  //show employees :
	    	  for(int i=0; i<listEmployees.size() ;i++)
	    	  {
	    		  System.out.println("\t The employee "+ (i+1) +":");
	    		  System.out.println(listEmployees.get(i).toString());
	    	  }
 			  System.out.println("Add, update or delete ? (a/u/d) :");
 			  char choice3 = reader.next().charAt(0);
 			  switch(choice3)
 			  {
	 			  case 'a' : 
	 				 Employee employe1 = new Employee();
		 			 System.out.println("New employee : ");
		 			 System.out.println("Enter first name : ");
		 			 employe1.setfirstName(reader.next()) ;
		 			 System.out.println("enter last name : ");
		 			 employe1.setlastName(reader.next()) ;
		 			 System.out.println("enter age: ");
		 			 employe1.setAge(reader.nextInt()) ;
		 			 System.out.println("enter matricule: ");
		 			 employe1.setSalary(reader.nextInt()) ;
		 			 listEmployees.add(employe1);
	 			  	break;
	 			  	
		      	  case 'u' : 
		      		for (int i = 0; i < listEmployees.size(); i++) 
					{
						System.out.println(listEmployees.get(i).toString()); 
					}
		 			 System.out.println("Update employee : ");
		 			 System.out.println("Entrez l'index de l'employee : ");
		 			 int id1 = reader.nextInt();
		 			 System.out.println("Enter the new first name: ");
		 			 listEmployees.get(id1).setfirstName(reader.next()) ;
		 			 System.out.println("enter last name : ");
		 			 listEmployees.get(id1).setlastName(reader.next()) ;
		 			 System.out.println("entrez the new age: ");
		 			 listEmployees.get(id1).setAge(reader.nextInt()) ;
		 			 System.out.println("enter the new salary: ");
		 			 listEmployees.get(id1).setSalary(reader.nextInt()) ;
		 			 System.out.println(listEmployees.get(id1).toString());
				  	break;
				  	
				  case 'd' : 
						for (int i = 0; i < listEmployees.size(); i++) 
						{
							System.out.println(listEmployees.get(i).toString()); 
						}
						System.out.println("Enter employee index : ");
						int id2 = reader.nextInt();
						listEmployees.remove(id2);
						System.out.println("Employee deleted");
				  	break;
				}
	        break;

	      case 'b':
	    	   System.out.println("Books list :");
		    	  //show books :
		    	  for(int i=0; i<listBooks.size() ;i++)
		    	  {
		    		  System.out.println("\t The book "+ (i+1) +":");
		    		  System.out.println(listBooks.get(i).toString());
		    	  }
	 			  System.out.println("Add, update or delete ? (a/u/d) :");
	 			  char choice4 = reader.next().charAt(0);
	 			  switch(choice4)
	 			  {
		 			  case 'a' : 
		 				 Book book4 = new Book();
			 			 System.out.println("New book : ");
			 			 System.out.println("Enter title : ");
			 			 book4.setTitle(reader.next()) ;
			 			 System.out.println("enter author : ");
			 			 book4.setAuthor(reader.next()) ;
			 			 System.out.println("enter price : ");
			 			 book4.setPrice(reader.nextInt()) ;;
			 			 listBooks.add(book4);
		 			  	break;
		 			  	
			      	  case 'u' : 
			      		for (int i = 0; i < listBooks.size(); i++) 
						{
							System.out.println(listBooks.get(i).toString()); 
						}
			 			 System.out.println("Update book : ");
			 			 System.out.println("Enter book index : ");
			 			 int id1 = reader.nextInt();
			 			 System.out.println("Enter the new title : ");
			 			 listBooks.get(id1).setTitle(reader.next()) ;
			 			 System.out.println("enter the new  author : ");
			 			 listBooks.get(id1).setAuthor(reader.next()) ;
			 			 System.out.println("enter price : ");
			 			 listBooks.get(id1).setPrice(reader.nextInt()) ;
			 			 System.out.println(listBooks.get(id1).toString());
					  	break;
					  	
					  case 'd' : 
							for (int i = 0; i < listBooks.size(); i++) 
							{
								System.out.println(listBooks.get(i).toString()); 
							}
							System.out.println("Enter book index : ");
							int id2 = reader.nextInt();
							listBooks.remove(id2);
							System.out.println("book deleted");
					  	break;
					}
	        break;

	        
	      default:
	        System.out.printf("Error! section is not correct");
	        return;
	        
	    	}

		}
		
	}
	
}