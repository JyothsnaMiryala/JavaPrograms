package com.methodOverloading;

public class Caluculator {
	

	public void add(int i, int j) {
		System.out.println("Sum from 1st method:"+(i+j));
		
	}
	public void add(int i, int j, int k) {
		System.out.println("Sum from 2nd method:"+(i+j+k));
		
	}
	
    public static void main(String[] args) {
    	Caluculator c = new Caluculator();
    	c.add(10,20);
    	c.add(10,20,30);
	}

	

}

