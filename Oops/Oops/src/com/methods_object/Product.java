package com.methods_object;

public class Product {
	int pid;
	String pname;
	double price;
}


class Driver4{
	
	public void print(Product p) {
		System.out.println(p.pid+".."+p.pname+".."+p.price);
		
	}
	public static void main(String[] args) {
		Driver4 d4 = new Driver4();
		Product p = new Product();
		p.pid=101;
		p.pname="keyboard";
		p.price=1500.0;
		d4.print(p);
		
		
	}
}

	

