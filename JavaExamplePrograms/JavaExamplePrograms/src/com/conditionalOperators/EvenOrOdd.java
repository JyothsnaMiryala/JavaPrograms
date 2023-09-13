package com.conditionalOperators;
import java.util.Scanner;
public class EvenOrOdd {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the number:");
      int num=sc.nextInt();
     String result= (num%2==0)?"Given number is even:":"Even number is odd";
      System.out.println(result);
       sc.close();
	}
}



