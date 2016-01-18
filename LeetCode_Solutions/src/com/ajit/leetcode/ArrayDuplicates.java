package com.ajit.leetcode;

import java.util.HashSet;

public class ArrayDuplicates {

	public static void main(String[] args) {
		int[] a = new int[5];
		a[0] = 1; a[1] = 1; a[2] = 2;a[3] = 2;a[4] = 3;
		System.out.println(removeDuplicates(a));
	}
	
	//accepted
	public static int removeDuplicates(int[] nums) {
        if(nums.length > 0) {
            int current = nums[0];
            int arrLength = 1;
            for(int i=1; i<nums.length; i++) {
            	if(nums[i] != current) {
            	    current = nums[i];
            		nums[arrLength++] = nums[i];
            	}
            }
            return arrLength;
        } else return 0;
    }
}
