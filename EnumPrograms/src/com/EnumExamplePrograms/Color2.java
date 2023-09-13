package com.EnumExamplePrograms;

public enum Color2 {
  RED,
  GREEN,
  YELLOW;
private Color2() {
	 System.out.println("Constructor called for:"+this.toString());
 }

 public void colorInfo() {
	System.out.println("Universal color");
	
}
}
class Demo1{
	public static void main(String[] args) {
		Color2 c1=Color2.RED;
		System.out.println(c1);
		c1.colorInfo();
	}
}
