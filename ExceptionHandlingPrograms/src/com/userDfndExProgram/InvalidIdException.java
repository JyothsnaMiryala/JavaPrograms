package com.userDfndExProgram;

import java.util.Arrays;

public class InvalidIdException extends RuntimeException {
 
	private String msg;

	public InvalidIdException(String msg) {
		this.msg=msg;
	}

	@Override
	public String toString() {
		return "InvalidIdException [msg=" + msg + "]";
	}

	
}
