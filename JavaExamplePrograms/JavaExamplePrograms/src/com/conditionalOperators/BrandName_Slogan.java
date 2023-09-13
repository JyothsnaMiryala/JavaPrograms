package com.conditionalOperators;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class BrandName_Slogan {
	public static void main(String[] args) throws IOException {
		InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        System.out.println("Enter BrandName:");
        String brandname = br.readLine();
        
        switch(brandname) {
        case "Nike":
        	System.out.println("Just do it");
        	break;
        case "Adidas":
        	System.out.println("Imposible is nothing");
        	break;
        case "Puma":
        	System.out.println("Forever Fast");
        	break;
        case "Rebok":
        	System.out.println("I Am What I AM ");
        	break;
        default:
        	System.out.println("Brand Not Found");
        		
        }
        
	}

}