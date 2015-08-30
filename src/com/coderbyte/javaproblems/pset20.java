package com.coderbyte.javaproblems;

import java.util.Arrays;

public class pset20 {
	String SecondGreatLow(int[] arr) { 
		Arrays.sort(arr);
		int len = arr.length;
		return arr[1] + " " + arr[len-2];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pset20 c = new pset20();
		int[] arr = {7, 7, 90, 1000003};
		System.out.print(c.SecondGreatLow(arr));
	}

}
