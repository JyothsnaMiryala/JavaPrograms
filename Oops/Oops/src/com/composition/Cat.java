package com.composition;

public class Cat extends Pet {

	private String name;
	public Cat(String name, int age) {
		super(name,age);
	}
	@Override
	public void speak() {
		System.out.println(this.name+"said meowww!");
	}
}
