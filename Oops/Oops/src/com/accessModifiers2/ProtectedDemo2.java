package com.accessModifiers2;
import com.accessModifiers1.ProtectedDemo1;
import com.accessModifiers1.ProtectedDemo3;
public class ProtectedDemo2 extends  ProtectedDemo1{

	public static void main(String[] args) {
		ProtectedDemo1 p1 = new ProtectedDemo1();
		//p1.m1();
		ProtectedDemo2 p2 = new ProtectedDemo2();
		p2.m1();
		ProtectedDemo1 p3=new ProtectedDemo2();
		//p3.m1();
	
	}

}
class ProtectedDemo4 extends ProtectedDemo1{
	public static void main(String[] args) {
		/*ProtectedDemo1 p1 = new ProtectedDemo1();
		p1.m1();
		ProtectedDemo3 p2 = new ProtectedDemo3();
		p2.m1();*/
		ProtectedDemo4 p3 = new ProtectedDemo4();
		p3.m1();
	    /*ProtectedDemo1 p4 =new ProtectedDemo3();
		p4.m1();
		ProtectedDemo1 p5= new ProtectedDemo4();
		p5.m1();
		ProtectedDemo3 p6 = new ProtectedDemo4();
		p6.m1();*/
	}
}