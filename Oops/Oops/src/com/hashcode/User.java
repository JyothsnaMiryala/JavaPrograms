package com.hashcode;

public class User {

	public static void main(String[] args) {
		User u1 = new User();
		System.out.println("user-1 Object hashcode:"+u1.hashCode());
		
		User u2 = new User();
		System.out.println("user-2 Object hashcode:"+u2.hashCode());
		
		User u3 = new User();
		System.out.println("user-3 Object hashcode:"+u3.hashCode());
		
	}

}
