package com.insta_static_local;

public class Test {
	int a;
	static int b;
	public static void main(String[] args) {
		int c=10;
		Test t= new Test();
	   System.out.println(t.a);
	   System.out.println(Test.b);
	   System.out.println(c);
		
	

}
}
