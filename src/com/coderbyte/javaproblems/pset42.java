package com.coderbyte.javaproblems;

public class pset42 {
	int SimpleMode(int[] arr) { 
		  
	    int mode = -1;
	    int max = 0;
	    int k;
	    for (int i = 0; i < arr.length-1; i++){
	      k = 0;
	      for (int j = i+1; j < arr.length; j++) {
	      	if (arr[i] == arr[j]) {
	        	k++;
	      	}
	        if (k > max) {
	         	max = k;
	          	mode = arr[i];
	        }
	    }
	    }
	    return mode;
	  }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pset42 c = new pset42();
		int[] arr = {5,5,2,2,1};
		System.out.print(c.SimpleMode(arr));
	}

}
