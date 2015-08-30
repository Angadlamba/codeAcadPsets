package com.coderbyte.javaproblems;

public class pset46 {
	String PermutationStep(int n) {
        String s = String.valueOf(n);
        char[] cc = s.toCharArray();
        int i = cc.length - 1;
        while(i >= 1 && cc[i-1] >= cc[i]) {
            i--;
        }
        if(i == 0) {
            return "-1";
        }

        int j = cc.length - 1;
        while(j >= 0 && cc[j] <= cc[i-1]) {
            j--;
        }

        swap(cc, i-1, j);
        reverse(cc, i, cc.length-1);
        return new String(cc);
    }
	void swap(char[] cc, int i, int j) {
        char c = cc[i];
        cc[i] = cc[j];
        cc[j] = c;
    }

    void reverse(char[] cc, int i, int j) {
        while(i < j) {
            swap(cc, i, j);
            i++;
            j--;
        }
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pset46 c = new pset46();
		System.out.print(c.PermutationStep(352));
	}

}
