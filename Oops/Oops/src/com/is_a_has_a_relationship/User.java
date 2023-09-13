package com.is_a_has_a_relationship;

public class User {
      int id;
      String name;
      
      void speak() {
    	  System.out.println("Hi,My Id is:"+id+", My Name:"+name);
    	  
      }
}
class Student extends User{
	public static void main(String[] args) {
		Student s= new Student();
		s.id=10;
		s.name="Navya";
		s.speak();
	}
}
