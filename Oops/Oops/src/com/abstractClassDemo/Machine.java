package com.abstractClassDemo;

public class Machine extends DieselMachine {
	public Machine() {
		System.out.println("Machine Constructor");
	}

	@Override
	public void fillFuel() {
		System.out.println("filling fuel tank....");
	}

}
