package com.conditionalOperators;
import java.util.*;
import java.io.*;
public class StudentGrade {
	public static void main(String[] args) throws Exception   {
       	float totalMarks=0;
      	InputStreamReader isr = new InputStreamReader(System.in);
    	BufferedReader br = new BufferedReader(isr);
    	System.out.println("Enter Number of Subjects:");
    	String s =br.readLine();
    	int count =Integer.parseInt(s);
    	System.out.println("Enter Marks of"+" "+count+" "+"subject");
     for(int i =0;i<count;i++) {
    	 String s1 =br.readLine();
    		 totalMarks =totalMarks+Integer.parseInt(s1);                                   
    	 }
    	 System.out.println("Total Marks:"+totalMarks);
    	float percentage =(totalMarks/(count*100))*100;
    	 switch((int)percentage/10) {
    	 case 9:
    		 System.out.println("Grade: A+");
    		 break;
    	 case 8:
    		 System.out.println("Grade: A");
    		 
    	 case 7:
    		 System.out.println("Grade: B");
    		 break;
    	 case 6:
    		 System.out.println("Grade: C");
    		 break;
    	 case 5:
    		 System.out.println("Grade: D");
    		 break;
    	 case 4:
    		 System.out.println("Grade: E");
    		 break;
    	default:
    	     System.out.println("Failed");		 
    		 break;
    		 
    		 
    		 
    		 
    	 }
     }
  }



