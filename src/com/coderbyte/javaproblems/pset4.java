package com.coderbyte.javaproblems;

public class pset4 {
	String LetterChanges(String str) {
		String str1 = new String();
		for(int i=0; i<str.length(); i++){
			if((str.charAt(i) >= 'a' && str.charAt(i) <= 'z') || (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')){
				if(str.charAt(i) == 'z' || str.charAt(i) == 'Z')
					str1 = str1 + (char)(str.charAt(i)-25); 
				else
					str1 = str1 + (char)(str.charAt(i)+1); 
			}
			else
	              str1 = str1 + (char)(str.charAt(i));
		}
		return LetterVowelsChanges(str1);
	}
	
	String LetterVowelsChanges(String str) {
		String str1 = new String();
		for(int i=0; i<str.length(); i++){
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u'){
				str1 = str1 + (char)(str.charAt(i)-32); 
			}
			else
				str1 = str1 + (char)(str.charAt(i));
		}
		return str1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pset4 c = new pset4();
		System.out.print(c.LetterChanges("hello world"));
	}

}
