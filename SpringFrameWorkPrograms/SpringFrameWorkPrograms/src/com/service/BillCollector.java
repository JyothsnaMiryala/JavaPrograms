package com.service;

import com.payment.CreditCard;
import com.payment.DebitCard;
import com.payment.Payment;

public class BillCollector {
	public Payment p;
	// public Payment p = new CreditCard();
	// public Payment p = new DebitCard();

	/*
	 * public void SetPayment(Payment p) { this.p=p; }
	 */

	public BillCollector(Payment p) {

		this.p = p;
	}

	public void Payment(double amount) {
		String result = p.pay();
		System.out.println(result);

	}

}