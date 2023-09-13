package com.Test;

public abstract class AbstractClass {
    
	public void m1() {
		System.out.println("Concrete Method");
	}
	abstract void m2();
	
	AbstractClass(){
		System.out.println("Abstract class Constructor");
	}
	
	//AbstractClass a = new AbstractClass();
}

