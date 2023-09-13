package com.inheritance_constructors;

public class Employee extends User{

	 double salary;
	public Employee() {
		System.out.println("Child calss::0 parameterised constructor");
	}
	void m2() {
		System.out.println("Child class-m2() method called");
	}
	public static void main(String[] args) {
		Employee e = new Employee();
		e.id=101;
		e.name="Navya";
		e.salary=25000.0;
		System.out.println(e.id+"--"+e.name+"--"+e.salary);
        e.m2();
        
        User u = new User();
        u.id=101;
        u.name="jyo";
        System.out.println(u.id+"--"+ u.name);
        
	}

}