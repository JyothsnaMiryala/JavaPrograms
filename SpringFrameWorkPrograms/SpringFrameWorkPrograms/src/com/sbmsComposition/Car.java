package com.sbmsComposition;

public class Car {

	public void drive() {
		Engine eng = new Engine();

		int result = eng.start();

		if (result >= 1) {
			System.out.println("Journy Started Successfully");
		} else {
			System.out.println("Engine has some problems");
		}
	}
}
