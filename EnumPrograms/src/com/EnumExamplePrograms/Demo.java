package com.EnumExamplePrograms;

public class Demo {
	 enum Color2 {
	     GREEN,
	     YELLOW,
	     BLUE,
	     WHITE,
	     RED;
	}
	 public static void main(String[] args) {
		 Color2 var1=Color2.GREEN;
		 switch(var1) {
		 case GREEN:
			 System.out.println("Green Color observed");
			 break;
		 case YELLOW:
			 System.out.println("Yellow Color observed");
			 break;
		 case BLUE:
			 System.out.println("Blue Color observed");
			 break;
		 case WHITE:
			 System.out.println("White Color observed");
			 break;
		 case RED:
			 System.out.println("Red Color observed");
			 break;
		 default:
			 System.out.println("Other Color observed");
		 }
		
			 
	}

}
