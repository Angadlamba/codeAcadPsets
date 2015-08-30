package com.coderbyte.javaproblems;

import java.util.Arrays;

public class pset43 {
	int Consecutive(int[] arr) {
		Arrays.sort(arr);
		int count = 0;
		for(int i=0; i<arr.length-1; i++){
			count += arr[i+1] - arr[i] - 1;
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pset43 c = new pset43();
		int[] arr = {-2,10,4};
		System.out.print(c.Consecutive(arr));
	}

}
