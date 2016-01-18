package com.ajit.leetcode;

public class SquareRoot {
	
	// use binary search to check same condition for a faster algorithm
	//simple soln
	public static int getSquareRoot(int n) {
		int root = 0;
		if(n == 1) return 1;
		for(int i=1; i <= n/2; i++) {
			if(i*i <= n) {
				root = i; 
				continue;
			}
		}
		return root;
	}
	public static void main(String[] args) {
		System.out.println(getSquareRoot(4));
		System.out.println(getSquareRoot(11));
		System.out.println(getSquareRoot(2));
	}

}
