package com.testing;

import com.payment.DebitCard;
import com.payment.UPI;
import com.service.BillCollector;

public class Test {

	public static void main(String[] args) {
		/*
		 * BillCollector b = new BillCollector();
		 * 
		 * b.SetPayment(new UPI()); b.Payment(1500.0);   //Setter Injection
		 */
		
		BillCollector b = new BillCollector(new UPI());
         b.Payment(1600.0);   //Constructor Injection
	}

}
