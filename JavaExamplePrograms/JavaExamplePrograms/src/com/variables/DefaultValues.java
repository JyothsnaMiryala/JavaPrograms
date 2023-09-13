package com.variables;

public class DefaultValues{
    byte b; 
    short s;
    int i;
    long l;
    float f;
    double d;
    char c;
    boolean b1;
    
    static int k;
    public static void main(String[] args){ 
	   DefaultValues dv =new DefaultValues();
	   System.out.println("Default Values for Integral data type are:");
       System.out.println(dv.b);
       System.out.println(dv.s);
       System.out.println(dv.i);
       System.out.println(dv.l);
       System.out.println("Default Values for Decimal data type are:");
       System.out.println(dv.f);
       System.out.println(dv.d);
       System.out.println("Default Values for Character data type are:");
       //default value is- Unicode value--we cannot see
       System.out.println("Default Values for boolean data type are:");
       System.out.println(dv.b1);
      
       System.out.println(k);
   }
}
 

