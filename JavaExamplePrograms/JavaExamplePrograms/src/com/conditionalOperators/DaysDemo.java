package com.conditionalOperators;
import java.io.*;
public class DaysDemo {
	public static void main(String[] args) throws Exception {
		
		/*InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter day number");
		String s = br.readLine();
	    int days=Integer.parseInt(s);
		
		switch(days) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
		default:
			System.out.println("No day Found");
     }*/
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter day number");
		String s = br.readLine();
	    int days=Integer.parseInt(s);
	    char ch = (char)days;
		
		switch(ch) {
		case 'a':
			System.out.println("Monday");
			break;
		case 'b':
			System.out.println("Tuesday");
			break;
		case 'c':
			System.out.println("Wednesday");
			break;
		case 'd':
			System.out.println("Thursday");
			break;
		case 'e':
			System.out.println("Friday");
			break;
		case 'f':
			System.out.println("Saturday");
			break;
		case 'g':
			System.out.println("Sunday");
			break;
		default:
			System.out.println("No day Found");
}

	}

}
