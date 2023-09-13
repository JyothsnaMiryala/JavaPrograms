package com.interfaces;

public class BankDemo {
  public static void main(String[] args) {
	RBIBank b;
	b= new AxisBank();
	b.moneyTransfer();
	b.checkBalance();
	
	b= new HDFCBank();
	b.moneyTransfer();
	b.checkBalance();
	
	//b= new Kotak();
  }
}
