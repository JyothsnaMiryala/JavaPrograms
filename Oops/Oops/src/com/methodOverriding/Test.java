package com.methodOverriding;

public class Test {

	public static void main(String[] args) {
		Child c = new Child();
		c.m1();
		
		Parent p = new Child();
		p.m1();
		
		Parent p1 = new Parent();
		p1.m1();
	}

}
