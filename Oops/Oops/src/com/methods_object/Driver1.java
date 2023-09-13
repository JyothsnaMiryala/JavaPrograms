package com.methods_object;

public class Driver1 {

	public static void main(String[] args) {

		Driver1 d = new Driver1();
		Person p = d.m1();//object1
		System.out.println(p.id + "...." + p.name + "..." + p.age);

	}

	Person m1() {
		Person p = new Person();//object2
		p.id = 101;
		p.name = "navya";
		p.age = 23;

		return p;
	}

}
