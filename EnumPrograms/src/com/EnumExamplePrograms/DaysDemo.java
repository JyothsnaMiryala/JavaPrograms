package com.EnumExamplePrograms;

enum Day {
	SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
}

public class DaysDemo   {
	Day day;

	public DaysDemo(Day day) {
		this.day = day;
	}
	public void dayIsLike() {
		switch(day) {
		case MONDAY:
			System.out.println("Monday");
			break;
		case TUESDAY:
			System.out.println("Tuesday");
			break;
		case WEDNESDAY:
			System.out.println("Wednesday");
			break;
		case THURSDAY:
			System.out.println("Thursday");
			break;
		case FRIDAY:
			System.out.println("Friday");
			break;
		case SATURDAY:
			System.out.println("Saturday");
			break;
		}
		
		
	}
	public static void main(String[] args) {
		String str ="MONDAY";
		DaysDemo d = new DaysDemo(Day.valueOf(str));
		d.dayIsLike();
	}
	

}
