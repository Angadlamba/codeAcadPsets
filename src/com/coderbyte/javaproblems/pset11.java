package com.coderbyte.javaproblems;

public class pset11 {
	String ABCheck(String str) { 
	
	    for (int i = 0; i < str.length() - 4; i++){
	     	if ((str.length() > 4) &&
	            (((str.charAt(i) == 'a') && (str.charAt(i+4) == 'b'))|
	            ((str.charAt(i) == 'b') && (str.charAt(i+4) == 'a'))))
	        {
	         	return "true";
	        }
	    }
	    return "false";
	  } 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pset11 c = new pset11();
		System.out.print(c.ABCheck("a cbed b s bb12e b  b12b b !!defoh"));	
	}

}
