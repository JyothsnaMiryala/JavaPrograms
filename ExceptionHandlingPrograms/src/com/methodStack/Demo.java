package com.methodStack;

public class Demo {
	public void m1(int a, int b) {
		System.out.println("m1() method started");
		try {
		int c=a/b;
		System.out.println(c);
		}
		catch(Exception e){
			System.out.println("Catch Exception");
		}
		System.out.println("m1() ended");
	}

	public static void main(String[] args)throws Exception {
		System.out.println("main() method started");
		Demo d = new Demo();
		d.m1(10,0);
		System.out.println("main() method ended");
	}

	

}
