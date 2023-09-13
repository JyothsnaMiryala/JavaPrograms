package com.accessModifiers1;

public class PrivateDemo1 {
 
	private int id;
	private String name;
	private PrivateDemo1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	private void m1() {
		System.out.println("PrivateDemo1 m1() method ");
	}
	@Override
	public String toString() {
		return "PrivateDemo1 [id=" + id + ", name=" + name + "]";
	}
	
}
