package com.methodOverriding1;

public class Test {

	public static void main(String[] args) {
		SBIBank bank = new SBIBank();
		String msg=bank.applyHomeLoan();
		System.out.println(msg);

	}

}
