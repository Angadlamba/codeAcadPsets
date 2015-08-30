package com.coderbyte.javaproblems;

public class pset1 {
	String FirstReverse(String str) { 
		String[] str1 = str.split(""); 
	    String newStr = new String();
		int len = str.length();
	    for(int i=0; i<len; i++){
	    	newStr = newStr + str1[len-i];
	    }
	    return newStr;
	  } 
	  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pset1 c = new pset1();
		System.out.println(c.FirstReverse("Angad"));
	}

}
