package com.ajit.leetcode;

public class FindElemPresentOnlyOnce {

	public static int findElemPresentOnce(int[] a, int low, int high) {
		if(low > high) return 0;
		if(low == high) {
			return a[low];
		}
		int mid = (low+high)/2;
		if(mid%2 == 0) {
			if(a[mid] == a[mid+1]) {
				return findElemPresentOnce(a, mid+2, high);
			} else {
				return findElemPresentOnce(a, low, mid-1);
			}
		} else {
			if(a[mid] == a[mid-1]) {
				return findElemPresentOnce(a, mid-2, high);
			} else {
				return findElemPresentOnce(a, low, mid-1);
			}
		}
	}
	public static void main(String[] args) {
		int[] a = new int[7];
		a[0] = 1; a[1] = 1; a[2] = 2; a[3] = 2; 
		a[4] = 3; a[5] = 4; a[6] = 4;
		System.out.println(findElemPresentOnce(a, 0, a.length-1));
	}

}
