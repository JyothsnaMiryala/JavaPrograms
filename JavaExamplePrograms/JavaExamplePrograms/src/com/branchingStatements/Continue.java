package com.branchingStatements;

public class Continue {

	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			if(i==6) { //i>=5
			  continue;
		    }
			System.out.println(i);
		}
		

	}

}
