package com.ajit.leetcode;

public class UglyNumber {

	//accepted
	public static boolean isUgly(int num) {
		if(num <= 0) return false;
	    if(num == 1) return true;
	    while( num > 1){
	        if(num % 2 == 0){
	            num /= 2;
	        }else if( num % 3 == 0){
	            num /=3;
	        }else if(num % 5 == 0){
	            num /= 5;
	        }else{
	            return false;
	        }
	    }
	    return true;
    }

	public static void main(String[] args) {
		//System.out.println(isUgly(6));
		//System.out.println(isUgly(8));
		System.out.println(isUgly(1332185066));
	}

}
