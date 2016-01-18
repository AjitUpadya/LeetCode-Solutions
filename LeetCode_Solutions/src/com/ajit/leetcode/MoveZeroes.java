package com.ajit.leetcode;

public class MoveZeroes {

	static int[] nums;
	//accepted
	public static void moveZeroes(int[] nums) {
		int zeroIndex = 0;
		boolean flag = false;
        for(int i=0; i<nums.length; i++) {
        	if(nums[i] == 0) {
        		zeroIndex = i;
        		flag = true;
        	}
        	if(flag) {
        		for(int j=i+1; j< nums.length; j++) {
        			if(nums[j] != 0) {
        				nums[zeroIndex] = nums[j];
        				nums[j] = 0;
        				break;
        			}
        		} 
        	}
        }
    }

	public static void main(String[] args) {
		nums = new int[5];
		nums[0] = 0; nums[1] = 1; nums[2] = 0; nums[3] = 3; nums[4] = 12;
		moveZeroes(nums);
		for(int i : nums) {
			System.out.print(i + ", " );
		}
	}

}
