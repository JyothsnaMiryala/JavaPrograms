/*Assignment : Develop a java program to decide role of software engineer based on his/her experience
-----------------------------------------------------------------------------------------------------------------------------------------------
0 - 2  year exp  -----> Associate Engineer

3 - 5 years exp -----> Software Engineer

6 - 9 years exp -----> Sr.Software Engineer

10 - 13 years exp ----> Manager*/

package com.controlStatements;

import java.io.*;

public class IfElseLadder {

	public static void main(String[] args) throws IOException {
		System.out.println("Enter your Experience:");
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		String result = br.readLine();
		int exp = Integer.parseInt(result);

		if (exp >= 0 && exp <= 2) {
			System.out.println("Associate Engineer");
		} else if (exp >= 3 && exp <= 5) {
			System.out.println("Software Engineer");
		} else if (exp >= 6 && exp <= 9) {
			System.out.println("Sr. Software Engineer");
		} else if (exp >= 10 && exp <= 13) {
			System.out.println("Manager");
		} else {
			System.out.println("Role Not Found");
		}
	}

}
