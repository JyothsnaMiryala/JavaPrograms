package com.ibm;
import com.oracle.Engine;
public class Car {
       public void drive() {
    	   Engine engine = new Engine();
    	   engine.start();
       }
       public static void main(String[] args) {
    	   Car car = new Car();
    	   car.drive();
	} 
}
