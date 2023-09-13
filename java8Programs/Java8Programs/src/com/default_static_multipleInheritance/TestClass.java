package com.default_static_multipleInheritance;

public class TestClass implements Interface1, Inerface2{

	@Override
	public void show() {
		
		Interface1.super.show();
		Inerface2.super.show();
	}

}
