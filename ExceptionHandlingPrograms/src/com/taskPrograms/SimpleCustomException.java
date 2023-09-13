package com.taskPrograms;

public class SimpleCustomException extends RuntimeException {

	 String msg;

	public SimpleCustomException(String msg) {
	          super(msg);
	          this.msg=msg;
	}

	@Override
	public String toString() {
		return msg;
	}

}
