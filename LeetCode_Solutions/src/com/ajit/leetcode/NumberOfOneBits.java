package com.ajit.leetcode;

public class NumberOfOneBits {

    // you need to treat n as an unsigned value
    public static int hammingWeight(int n) {
        String s = Integer.toBinaryString(n);
        String[] a = s.split("");
        int count = 0;
        for(String str : a) {
            if(str.equals("1")) {
                count++;
            }
        }
        return count;
    }

	public static void main(String[] args) {
		System.out.println(hammingWeight(11));
	}

}
