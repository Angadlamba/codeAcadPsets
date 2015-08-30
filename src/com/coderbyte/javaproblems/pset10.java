package com.coderbyte.javaproblems;

import java.util.Arrays;

public class pset10 {
	String AlphabetSoup(String str){
		String[] str1 = str.split("");
		Arrays.sort(str1);
		return String.join("",str1);	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pset10 c = new pset10();
		System.out.print(c.AlphabetSoup("abc!!defoh"));		
	}

}
