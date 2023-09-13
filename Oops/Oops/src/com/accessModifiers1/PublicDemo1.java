package com.accessModifiers1;

public class PublicDemo1 {
         int id;
         String name;
         public PublicDemo1(int id, String name) {
			super();
			this.id = id;
			this.name = name;
		}
		
	 @Override
		public String toString() {
			return "PublicDemo1 [id=" + id + ", name=" + name + "]";
		}

	public void m1() {
		 System.out.println("PublicDemo1 m1() method");
	 }
}

