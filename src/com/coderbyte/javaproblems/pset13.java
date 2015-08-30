package com.coderbyte.javaproblems;

public class pset13 {
	int WordCount(String str){
		return str.split(" ").length;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pset13 c = new pset13();
		System.out.print(c.WordCount("hellosffs world asfagf; a"));
	}

}
