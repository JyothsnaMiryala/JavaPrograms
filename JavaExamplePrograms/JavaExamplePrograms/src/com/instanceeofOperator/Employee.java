package com.instanceeofOperator;

public class Employee {

	public static void main(String[] args) {
         Employee e = new Employee();
         Student s = new Student();
         if(e instanceof Employee) {
        	 System.out.println("Yes it is Employee type");
         }
         else {
        	 System.out.println("It is not Employee type");
         }
		

	}

}
