package com.methods_object;

public class Person2 {

	int id;
	String name;

	private Person2[] m2() {
		Person2 p1 = new Person2();
		p1.id = 101;
		p1.name = "Raju";
		Person2 p2 = new Person2();
		p2.id = 102;
		p2.name = "Rani";
		Person2 p3 = new Person2();
		p3.id = 103;
		p3.name = "Anil";

		Person2[] arr = { p1, p2, p3 };
		return arr;
	}

	private void m1(Person2 p1, Person2 p2) {
		System.out.println(p1.id + "...." + p1.name);
		System.out.println(p2.id + "...." + p2.name);

	}

	public static void main(String[] args) {
		Person2 p1 = new Person2();
		Person2 p2 = new Person2();
		p2.id = 101;
		p2.name = "Raju";

		Person2 p3 = new Person2();
		p3.id = 102;
		p3.name = "Rani";

		p1.m1(p1, p2);
		Person2[] arr = p1.m2();

		for (Person2 person : arr) {
			System.out.println(person.id + "....." + person.name);
		}
	}
}