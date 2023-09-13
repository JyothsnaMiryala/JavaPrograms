package com.LambdaExpressions1;

public interface FunInterface {
    
	public void abstractFun(int a);
	
	default void normalFun() {
		System.out.println("Default Method");
	}
}
