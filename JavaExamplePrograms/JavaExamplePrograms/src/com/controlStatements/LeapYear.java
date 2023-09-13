package com.controlStatements;
import java.util.*;
public class LeapYear {
	public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter a Year:");
       int year = input.nextInt();
       boolean isLeapYear = false;
       if(year%4==0) {
    	   if(year%100==0) {
    		   if(year%400==0) {
    			   isLeapYear=true;
		       }
    	   }
    	   /*else {
        	   isLeapYear =true;
           }*/
       }
       if(isLeapYear) {
   		System.out.println(year+" "+"is a Leap year.");
   	   }
       else {
    	   System.out.println(year+" "+"is not a leap year.");
       }
	}
	

}
