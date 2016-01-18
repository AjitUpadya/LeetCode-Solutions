package com.ajit.leetcode;

public class ValidAnagram {
	
	public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        for(int i=0; i<s.length(); i++) {
        	int sCount = s.length() - s.replace(String.valueOf(s.charAt(i)), "").length();
        	int tCount = t.length() - t.replace(String.valueOf(s.charAt(i)), "").length();
        	if(  sCount != tCount || t.indexOf(s.charAt(i)) == -1) {
        		return false;
        	}
        }
        return true;
    }

	//accepted
	public static boolean isAnagram1(String s, String t) {
		if(s.length() != t.length()) return false;
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();
        int sSum = 0;int tSum = 0;
        for(int i = 0;i < sChar.length; i++) {
        	if(t.indexOf(sChar[i]) == -1) return false;
        	sSum += sChar[i];
        	tSum += tChar[i];
        }
        if(sSum == tSum) {
        	return true;
        } else return false;
        
    }
	
	public static void main(String[] args) {
		System.out.println(isAnagram1("aacc", "ccac"));
		System.out.println(isAnagram1("rat", "art"));
		
		
	}

}
