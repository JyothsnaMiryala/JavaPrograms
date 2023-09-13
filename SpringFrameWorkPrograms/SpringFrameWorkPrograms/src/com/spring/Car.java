package com.spring;

public class Car extends PetrolEngine{
    public void drive() {
    	int result = super.start();
    	if(result>=1) {
    		System.out.println("Journey Started Sucessfully");
    	}
    	else {
    		System.out.println("Engine has some problem");
    	}
    	
    }
}
