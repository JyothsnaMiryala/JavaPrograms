package com.conditionalOperators;
import java.util.*;
public class SwitchProgram {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); 
    System.out.println("Enter number of Days:");
	int noOfDays =sc.nextInt();
    switch(noOfDays) //Switch expression  
    {  
       case 28: 
       System.out.println("Only February month has 28 days");  
       break;  
       case 30:
       System.out.println("April, June, August, October, December has 30 days");  
       break;  
      case 31: System.out.println("January, March, May, July, September, November has 31 days");  
       break;  
      default: System.out.println("Please enter valid no of days");  
   }  
  }  
}

