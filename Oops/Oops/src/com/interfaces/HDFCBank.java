package com.interfaces;

public class HDFCBank implements RBIBank{

	@Override
	public void moneyTransfer() {
		System.out.println("money Transfer from HDFC");
		
	}

	@Override
	public void checkBalance() {
		System.out.println("Checking Balance from HDFC");
	}

	

}
