package com.coderbyte.javaproblems;

public class pset29 {
	String PowersofTwo(int num) { 
		while(num%2 == 0){
			num = num/2;
			if(num == 1)
				return "true";
		}
		return "false";
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pset29 c = new pset29();
		System.out.print(c.PowersofTwo(8));
	}
}


