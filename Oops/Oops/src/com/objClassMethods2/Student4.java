package com.objClassMethods2;

public class Student4 {
     public static void main(String[] args) throws Exception{
		
    	 Student4 s= new Student4();
    	 Class clz=s.getClass();
    	 System.out.println(clz.getName());
    	 System.out.println(s.getClass().getName());
	       
    	Object obj= clz.newInstance();
    	System.out.println(obj);
     
     }
}
