package com.interfaces;

public class AxisBank implements RBIBank {

	@Override
	public void moneyTransfer() {
		System.out.println("money Transfer from AxisBank");
		
	}

	@Override
	public void checkBalance() {
		System.out.println("checkBalance from AxisBank");
		
	}

}
