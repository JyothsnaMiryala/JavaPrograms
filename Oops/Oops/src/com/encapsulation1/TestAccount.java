package com.encapsulation1;

public class TestAccount {

	public static void main(String[] args) {

		Account obj = new Account(); 
		obj.setAccNum(615452);
		obj.setName("NavyaThati");

		int accNum = obj.getAccNum();
		String name = obj.getName();

		System.out.println(accNum + "--" + name);
	}
}
