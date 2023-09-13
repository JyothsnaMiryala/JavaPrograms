package com.controlStatements;

import java.util.*;
import java.io.*;

public class UserLoginDemo {
	String userName;
	String password;

	public void login(String userName, String password) {
		if (userName.equals("Navya") && password.equals("54423")) {
			System.out.println("username"+userName);
			System.out.println("password"+password);

			System.out.println("User Login Successfully");

		} else {

			System.out.println("Invalid Credentials");
		}

	}

	public static void main(String[] args) throws IOException {
		UserLoginDemo c = new UserLoginDemo();
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.println("Enter userName:");
		String userName = br.readLine();
		System.out.println("Enter password:");
		String password = br.readLine();
		c.login(userName, password);
	}
}
