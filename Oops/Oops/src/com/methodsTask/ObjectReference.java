package com.methodsTask;

public class ObjectReference {

	 static int a=10;
     static  int b=20;
	
	public static void main(String[] args) {
		
		
		ObjectReference.isSame();
		
	}

	public static void isSame() {
		ObjectReference p =new ObjectReference(); 
		if(a==b) {
			System.out.println("Both references pointed to same object");
		}
		else {
			System.out.println("Both references not pointed to same object");
		}
		
		
	}

}
