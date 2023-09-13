package com.namingConventions;

public class ForMethods {
         int a;
         int b;
         public void sum(int a,int b) {
        	 System.out.println(a+b);
         }
         public void substraction(int a,int b) {
        	 System.out.println(a-b);
         }
	public static void main(String[] args) {
		ForMethods m = new ForMethods();
		 m.sum(10,20);
		 m.substraction(30,10);

}
}
