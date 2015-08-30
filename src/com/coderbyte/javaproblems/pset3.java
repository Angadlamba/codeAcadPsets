package com.coderbyte.javaproblems;

public class pset3 {
	String LongestWord(String sen) {
		String[] str = sen.split(" ");
		int index = 0;
		for(int i=0; i<str.length; i++){
			if(str[i].length() > str[index].length())
				index = i;
		}
		return str[index];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pset3 c = new pset3();
		System.out.println(c.LongestWord("Hello! my name is Angadd kafffa2"));
	}
}
