package com.constructors;

public class Test {
      int x=10;
      void method() {
    	  System.out.println(x);
      }
	public static void main(String[] args) {
		Test t1 = new Test();
		Test t2 = new Test();
		
		t1.x=t1.x+10;
		t1.method();
		t2.method();
		
	}

}
