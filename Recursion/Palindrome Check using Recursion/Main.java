package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        String s = "ababa";
        System.out.println(palindrome(s, 0, s.length() -1));
    }
    static boolean palindrome(String str , int end, int start){
        if(start >= end)
            return true;

        return ((str.charAt(start)==str.charAt(end)) &&
                palindrome(str, start + 1, end - 1));
    }
}
