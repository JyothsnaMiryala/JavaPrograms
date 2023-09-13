package com.objClassMethods1;

public class EqualsDemo {
	public static void main(String[] args) {
		String s1 = new String("Navya");
		String s2 = new String("Navya");
		System.out.println(s1.equals(s2));
		
		
		Employee emp1 = new Employee(101,"Navya","Hyderabad");
		Employee emp2 = new Employee(101,"Navya","Hyderabad");
		System.out.println(emp1.equals(emp2));
		
		System.out.println(emp1.hashCode());
		System.out.println(emp2.hashCode());
	}
}
