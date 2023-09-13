package com.inheritence_composition;

class Car {

	private String colour;

	private int max_Speed;

	public void carDetails() {

		System.out.println("Car Colour= " + colour + ";" + " Maximum Speed= " + max_Speed);

	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public void setMaxSpeed(int max_Speed) {
		this.max_Speed = max_Speed;

	}

}
