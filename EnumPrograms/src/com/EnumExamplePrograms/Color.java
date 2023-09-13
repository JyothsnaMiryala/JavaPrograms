//1. Declaration outside the class
package com.EnumExamplePrograms;

public enum Color {
	RED, GREEN, BLUE;

}
 class Test{
	public static void main(String[] args) {
		Color c1=Color.RED;
		System.out.println(c1);
		Color c2=Color.GREEN;
        System.out.println(c2);
        Color c3=Color.BLUE;
        System.out.println(c3);
	}
}
