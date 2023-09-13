package com.methodStack;

public class InvalidNumberException1 extends Exception {
         private String msg;

		public InvalidNumberException1(String msg) {
        	 this.msg=msg;
         }

		@Override
		public String toString() {
			return "InvalidNumberException1 [msg=" + msg + "]";
		}
}
