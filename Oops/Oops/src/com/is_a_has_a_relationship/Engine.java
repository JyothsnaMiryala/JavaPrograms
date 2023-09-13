package com.is_a_has_a_relationship;


public class Engine {
     int id;
     String name;
     String fuelType;
     
     void start() {
    	 System.out.println("Engine Started....");
     }
}
class Car{
	void drive() {
		Engine e= new Engine();
		e.start();
		System.out.println("Journey Started");
	}
}
class Test{
	public static void main(String[] args) {
		Car c = new Car();
		c.drive();
	}
}