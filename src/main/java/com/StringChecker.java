package com;
public class StringChecker {
    public static String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }

    public static boolean isPalindrome(String str) {
        StringBuilder sb=new StringBuilder(str);
        String res1= sb.reverse().toString();
        return str.equals(res1);
    }

    public static String toUpperCase(String str) {
        return str.toUpperCase();
    }
}