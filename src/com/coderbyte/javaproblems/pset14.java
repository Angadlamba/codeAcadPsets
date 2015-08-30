package com.coderbyte.javaproblems;

public class pset14 {
	String PrimeTime(int num){
		for(int i=2; i<=num/2; i++){
			if(num % i == 0)
				return "false";
		}
		return "true";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pset14 c = new pset14();
		System.out.print(c.PrimeTime(4));
	}
}
