package com.methods_object;

public class Person1 {
	int id;
	String name;
	int age;
}
class Driver8 {

	public static void main(String[] args) {
		Driver8 d = new Driver8();

		

		Person person = d.m1(101);
		System.out.println(person.id + "--" + person.name);
	}

	Person m1(int id) {
		Person p = new Person();
		if (id == 101) {
			p.id = 101;
			p.name = "Raju";
			p.age = 30;
		} else if (id == 102) {
			p.id = 102;
			p.name = "Rani";
			p.age = 32;
		}
		return p;
	}
}
