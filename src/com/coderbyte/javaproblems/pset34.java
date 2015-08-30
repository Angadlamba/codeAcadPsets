package com.coderbyte.javaproblems;

public class pset34 {
	int PrimeMover(int num) {
		int count = 0;
		int number = 2;
		while(count != num){
			if(PrimeTime(number) == 0)
				count++;	
			number++;
		}
		return number-1;
	}
	int PrimeTime(int num){
		for(int i=2; i<=num/2; i++){
			if(num % i == 0)
				return -1;
		}
		return 0;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pset34 c = new pset34();
		System.out.print(c.PrimeMover(9));
	}

}
