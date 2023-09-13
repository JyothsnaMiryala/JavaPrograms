package com.objClassMethods;

public class Test_ToString {
      public static void main(String[] args) {
    	  Employee e = new  Employee(101,"Navya","Hyderabad");
    	  System.out.println(e);
    	  System.out.println(e.toString());
    	  System.out.println("hashcode:"+e.hashCode());
    	  
	}
}
