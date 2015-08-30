package com.coderbyte.javaproblems;

public class pset33 {
	String RunLength(String s) {
        char[] cc = s.toCharArray();
        int cnt = 1;
        StringBuilder sb = new StringBuilder();
        for(int i=1; i<cc.length; i++) {
            if(cc[i] == cc[i-1]) {
                cnt++;
            } else {
                sb.append(cnt).append(cc[i-1]);
                cnt = 1;
            }
        }
        sb.append(cnt).append(cc[cc.length-1]);;
        return sb.toString();
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pset33 c = new pset33();
		System.out.print(c.RunLength("wwwbbbwggg"));
	}

}
