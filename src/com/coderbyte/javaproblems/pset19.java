package com.coderbyte.javaproblems;

import java.util.Arrays;

public class pset19 {
	String LetterCountI(String str) { 
		String[] str1 = str.split(" ");
		int[] count = new int[str1.length];
		int index = 0;
		for(int i=0; i<str1.length; i++)
			count[i] = repeatedLetter(str1[i]);
		
		for(int i=0; i<str1.length-1; i++){
			if(count[i] < count[i+1])
				index = i+1;
		}
		
		if(count[index] > 0)
			return str1[index];
		else 
			return "-1";
	}
	
	int repeatedLetter(String str){
		int[] count = new int[str.length()];
		for(int i=0; i<str.length(); i++){
			for(int j=i+1; j<str.length(); j++){
				if(str.charAt(i) == str.charAt(j))
					count[i]++;
			}
		}
		return max(count);
	}
	
	int max(int[] num){
		Arrays.sort(num);
		return num[num.length-1];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pset19 c = new pset19();
		System.out.print(c.LetterCountI("Hello apple pie"));
	}

}
