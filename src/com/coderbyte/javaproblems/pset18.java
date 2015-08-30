package com.coderbyte.javaproblems;

import java.util.Arrays;

public class pset18 {
	String ArrayAdditionI(int[] arr) { 
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
		pset18 c = new pset18();
		int[] arr = {4, 6, 23, 10, 1, 3};
		System.out.print(c.ArrayAdditionI(arr));
	}

}
