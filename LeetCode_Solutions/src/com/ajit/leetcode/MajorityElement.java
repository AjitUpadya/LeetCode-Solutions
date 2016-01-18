package com.ajit.leetcode;

public class MajorityElement {

	public static int majorityElement(int[] nums) {
		//int mid = nums[n/2];
		int majLeft = findMajority(0, nums.length -1, nums, nums.length);
		return 0;
    }
	
	public static int findMajority(int low, int high, int[] nums, int n) {
		if(n == 1) return nums[0];
		int mid = n/2;
		
		int majLeft = findMajority(0, n/2, nums, mid);
		int majRight = findMajority(n/2+1, n, nums, mid);
		
		return majLeft;
	}
	
	public static void main(String[] args) {
		System.out.println(Long.valueOf(Integer.toBinaryString(11)));
		int[] a = new int[9];
		a[0] = 1; 
		a[1] = 2; 
		a[2] = 2;
		a[3] = 2;
		a[4] = 4;
		a[5] = 2;
		a[6] = 2;
		a[7] = 3;
		a[8] = 2;
		System.out.println(majorityElement(a));
	}

}
