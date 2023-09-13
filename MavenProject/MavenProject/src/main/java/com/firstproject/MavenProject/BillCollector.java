package com.firstproject.MavenProject;

public class BillCollector {
	
	private Payment p;
	public BillCollector() {
		System.out.println("BillCollector class Constructor Called" );
	}
	BillCollector(Payment p){
		this.p=p;
	}

	/*public Payment getP() {
		return p;
	}

	public void setP(Payment p) {
		this.p = p;
	}*/

	public void Payment() {
		String result = p.pay();
		System.out.println(result);

	}
}
