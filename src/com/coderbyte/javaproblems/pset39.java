package com.coderbyte.javaproblems;

import java.util.Arrays;

public class pset39 {
	String ArrayAddition(int[] arr) { 
		Arrays.sort(arr);
		int sum = 0;
		int len = arr.length;
		for(int i=0; i<len-1; i++){
			sum = sum + arr[i];
		}
		if(sum < arr[len-1])
			return "false";
		if(sum == arr[len-1])
			return "true";
		else if(sum > arr[len-1]) {
				for(int i=0; i<len-1; i++) {
					if(sum > arr[len-1])
						sum = sum - arr[i];
					if(sum == arr[len-1])
						return "true";
					else 
						sum = sum + arr[i];
				}
			}
		return "false";
				
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pset39 c = new pset39();
		int[] arr = {31,2,90,50,7};
		System.out.print(c.ArrayAddition(arr));
	}

}
