package com.constructorOverloading;

public class Employee {
     
	int id;
	String name;
	Double salary;
	
	Employee(){
		System.out.println("no-arg Constructor");
	}
	
	Employee(int id,String name){
	    this.id=id;
	    this.name=name;
	  System.out.println("int-String arguments");
	   
	}
	Employee(int id,String name,Double salary){
	    this.id=id;
	    this.name=name;
	    this.salary=salary;
	    System.out.println("int-String-double arguments");
	 
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
}
