package com.coderbyte.javaproblems;

import java.util.Arrays;

public class pset24 {
	int MeanMode(int[] arr) { 
		Arrays.sort(arr);
		int avg = mean(arr);
		int mode = mode(arr);
		if(mode == avg)
			return 1;
		else return 0;
	}
	
	int mean(int[] arr){
		int sum = 0;
		for(int i=0; i<arr.length; i++){
			sum += arr[i];
		}
		return sum/arr.length;
	}
	int mode(int[] arr){
		int[] count = new int[arr.length];
		int index = 0;
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr.length; j++){
				if(arr[i] == arr[j])
					count[i]++;
			}
		}
		for(int i=1; i<count.length; i++){
			if(count[i] > count[index])
				index = i;
		}
		return arr[index];
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pset24 c = new pset24();
		int[] arr = {5, 3, 3, 3, 1};
		System.out.print(c.MeanMode(arr));
	}

}
