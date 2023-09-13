package com.mapPrograms;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class ProprtiesDemo {

	public static void main(String[] args) throws Exception {
		Properties p = new Properties();
		FileInputStream fis = new FileInputStream("myproperties.properties");
		p.load(fis);
		System.out.println(p);
		String propertyvalue = p.getProperty("pwd");
		System.out.println(propertyvalue);
		p.setProperty("mobileNumber", "9892655454");
		FileOutputStream fos = new FileOutputStream("myproperties.properties");
		p.store(fos, "Updated by Navya");
	}
}
