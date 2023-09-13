package com.constructorOverloading;

public class Test1 {

	public static void main(String[] args) {
		Employee e1 = new Employee();
		Employee e2 = new Employee(101,"Navya");
		Employee e3 = new Employee(101,"Navya",35000.0);
		
		System.out.println(e1);
		System.out.println(e2);
		System.out.println(e3);
	}

}
