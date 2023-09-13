package com.EnumExamplePrograms;

public class WeekdaysDemo {
	enum WEEKDAYS {
		MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY;
	}

	enum WEEKENDDAYS {
		SATURDAY, SUNDAY;
	}

	public static void main(String[] args) throws Exception {
        System.out.println("***WEEKDAYS***");
		WEEKDAYS[] values = WEEKDAYS.values();

		for (WEEKDAYS c : values) {
			System.out.println(c);

		}
		 System.out.println("***WEEKENDDAYS***");
		WEEKENDDAYS[] values1 = WEEKENDDAYS.values();
		for (WEEKENDDAYS c1 : values1) {
			System.out.println(c1);
		}
	}
}