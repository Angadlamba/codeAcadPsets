package com.coderbyte.javaproblems;

public class pset21 {
	String CaesarCipher(String str, int num) { 
	    String str1 = new String();
		for(int i=0; i<str.length(); i++){
			if((str.charAt(i) >= 'A' && str.charAt(i) <='Z') || (str.charAt(i) >= 'a' && str.charAt(i) <= 'z'))
				if((str.charAt(i) >= 'A' && str.charAt(i) <='Z'))
					if((str.charAt(i) + num) <= 90)
						str1 = str1 + (char)(str.charAt(i) + num); 
					else
						str1 = str1 + (char)((str.charAt(i) - 90 + num) + 64);
				else
					if((str.charAt(i) + num) <= 122)
						str1 = str1 + (char)(str.charAt(i) + num); 
					else
						str1 = str1 + (char)((str.charAt(i) - 122 + num) + 96);
			else
				str1 = str1 + str.charAt(i);
		}
		return str1;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pset21 c = new pset21();
		System.out.print(c.CaesarCipher("byte-dash", 0));
	}

}
