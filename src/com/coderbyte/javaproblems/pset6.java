package com.coderbyte.javaproblems;

public class pset6 {
	String LetterCapitalize(String str) { 
	  	String[] str1 = str.split(" ");
	    int length = str1.length;
	    String strNew = new String();
	    for(int i=0; i<length; i++){
	    	if(str1[i].charAt(0) >= 'a' && str1[i].charAt(0) <= 'z')
	    		strNew = strNew + (char)(str1[i].charAt(0)-32);
	    	else
	    		strNew = strNew + (char)(str1[i].charAt(0));
	    	for(int j=1; j<str1[i].length(); j++){
		    	strNew = strNew + (char)(str1[i].charAt(j));
	    	}
	    	strNew = strNew + " ";
	    }
	    
	    return strNew;
	    
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pset6 c = new pset6();
		System.out.print(c.LetterCapitalize("hello world sladh !lda;"));
	}

}
