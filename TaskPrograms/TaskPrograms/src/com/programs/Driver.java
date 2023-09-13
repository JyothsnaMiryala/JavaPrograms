package com.programs;

public class Driver {
	public static void main(String[] args){
		Driver d = new Driver();
		Person person = d.m1();
		System.out.println(person);
	}
	Person m1(){
		Person p = new Person();
		p.setId(101);;
		p.setName("Shiva");
		p.setAge(34);
		return p;
		
	}
}