package com.ajit.leetcode;

public class ValidPalindrome {
	
	public static String replaceSpecial(String s) {
        s =  s.replaceAll("[^a-zA-Z0-9 ]", "");
        return s.replaceAll("\\s","");
    }
	
	public static boolean isPalindrome(String s) {
		if(s.length() == 0) return true;
		else {
			s = replaceSpecial(s);
			String[] a = s.trim().split("");
			int j = a.length - 1;
			for(int i=0; i<a.length; i++) {
				if(a[i].length() > 0 && !a[i].equals(" ") && !a[j].equals(" ")) {
					if(a[i].equalsIgnoreCase(a[j])) {
						j--; continue;
					} else {
						return false;
					}
				}
			}
		}
		return true;
	}
	
	//accepted
	public static boolean isPalindrome1(String s) {
		if(s.length() == 0) return true;
		else {
			StringBuilder sb = new StringBuilder();
			s = replaceSpecial(s);
			for(int i=s.length() -1 ; i>=0; i--) {
				sb.append(s.charAt(i));
			}
			if(s.equalsIgnoreCase(sb.toString())) return true; else {
				return false;
			}
		}
	}
	
	public static boolean recursivePalindrome(String s) {
		if(s.length() == 1) return true;
		if(s.charAt(0) == s.charAt(s.length()-1)) {
			return recursivePalindrome(s.substring(1, s.length()-1));
		}
		return false;
	}
	public static void main(String[] args) {
		//System.out.println(isPalindrome("a."));
		//System.out.println(isPalindrome1("a."));
		System.out.println(recursivePalindrome("abcba"));
	}

}
