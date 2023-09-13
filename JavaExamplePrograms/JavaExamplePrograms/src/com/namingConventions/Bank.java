package com.namingConventions;

public class Bank {
   String s1;
   String s2;
   
   public void getWelcomeMsg(String s1,String s2) {
	   System.out.println(s1+" "+s2);
   }
	public static void main(String[] args) {
		Bank b = new Bank();
		b.getWelcomeMsg("Welcome to","UnionBankOfIndia");	}

}
