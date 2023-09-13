package com.firstproject.MavenProject;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");
		/*BillCollector bc = context.getBean("billcollector", BillCollector.class);
		bc.Payment();*/

		/*
		 * BillCollector bc1 =context.getBean("billcollector", BillCollector.class);
		 * BillCollector bc2 = context.getBean("billcollector", BillCollector.class);
		 * System.out.println(bc1.hashCode()); System.out.println(bc2.hashCode());
		 */
		/*
		 * DebitCard dc1 = context.getBean("debit",DebitCard.class); DebitCard dc2 =
		 * context.getBean("debit",DebitCard.class); System.out.println(dc1.hashCode());
		 * System.out.println(dc2.hashCode());
		 */
		         //UPI u=context.getBean("upi", UPI.class);
	
	}
}
