package com.stringTaskPrograms;
//doubt
import java.util.*;
import java.text.*;

public class ConvertDateToString {

	public static String convertDateToString(String date) {

		DateFormat df = new SimpleDateFormat(date);

		Date today = Calendar.getInstance().getTime();

		String dateToString = df.format(today);

		return (dateToString);
	}

	public static void main(String args[]) {

		String date = "07-27-2020";

		System.out.print(convertDateToString(date));
	}
}
