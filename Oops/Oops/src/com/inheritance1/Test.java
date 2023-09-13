package com.inheritance1;

public class Test {

	public static void main(String[] args) {
		Daughter d= new Daughter();
		System.out.println(d.salary);
		System.out.println(d.hashCode());
		
		Father f = new Father();
		System.out.println(f.salary);
		System.out.println(f.hashCode());
		
		GrandDaughter g = new GrandDaughter();
		System.out.println(g.salary);
		System.out.println(g.getClass());
	}

}
