package com.conditionalOperators;
import java.io.*;
public class Switch_Demo {
  public static void main(String[] args) throws IOException {
	  InputStreamReader isr = new InputStreamReader(System.in);
	  BufferedReader br = new BufferedReader(isr);
	  System.out.println("Enter input value:");
	 String result = br.readLine();
	  int input = Integer.parseInt(result);
          switch(input){
          case 0:
          case 1:
          case 2:
          case 3:
          case 4:
              System.out.println("input value is less than 5");
              break;
          case 5:
          case 6:
          case 7:
          case 8:
          case 9:
              System.out.println("input value is less than 10");
              break;
               
          default:
              System.out.println("Default statement");
           
          }

      }
  }   



