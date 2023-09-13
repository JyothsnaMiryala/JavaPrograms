package com.inheritance_methods;

public class Employee extends User{

	void m2() {
		System.out.println("Employee class:: m2() method called");
	}
	public static void main(String[] args) {
		Employee e = new Employee();
		e.id=101;
		e.name="Navya";
		System.out.println(e.id+"..."+e.name);
		e.m1();
		e.m2();

		User u = new User();
		u.id=102;
		u.name="Jyothsna";
		System.out.println(u.id+"..."+u.name);
		u.m1();
		//u.m2();
	}

}
