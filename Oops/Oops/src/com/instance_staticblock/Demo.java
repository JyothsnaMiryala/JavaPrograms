package com.instance_staticblock;

public class Demo {

	{
		System.out.println("iam from instance block");
	}

	public Demo() {
		System.out.println("Iam from constructor");
	}

	static {
		System.out.println("Iam from static block");
	}

	public static void main(String[] args) {
		System.out.println("iam from main method....");
		Demo d = new Demo();
	}
}
