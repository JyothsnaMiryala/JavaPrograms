package com.methodOverriding1;

public class SBIBank extends RBIBank {
	double getHomeLoanRofi() {
		return 12.85;
    	
    }
    public String applyHomeLoan() {
    	
    	boolean status=checkEligibility();
    	if(status) {
    		double homeLoanRofi=getHomeLoanRofi();
            String msg="your loan approved with RI as::"+homeLoanRofi;
              return msg;
    	}
    	else {
    		return "Youb are not eligible for home loan";
    	}
    	
    }
}