package com.dn.corejava;

public class PalindromeString {

    public static void main(String[] args){
        PalindromeString palindromeString = new PalindromeString();
        String str = "BoB";
        StringBuilder sb = new StringBuilder("ABA");
        StringBuilder reverse = sb.reverse();
        System.out.println(reverse);
        Boolean isPalindrome = palindromeString.isPalindrome(str);
        System.out.println(isPalindrome);
    }

    private Boolean isPalindrome(String str) {
        char[] arrayOfChar = str.toCharArray();

        char[] arrayOfChar1 = new char[arrayOfChar.length];
        int j=0;
        for(int i=arrayOfChar.length-1;i>=0;i--) {
            arrayOfChar1[j] = arrayOfChar[i];
            j++;
        }
        String str1 = String.copyValueOf(arrayOfChar1);

        if(str.equals(str1)){
            return true;
        }
        return false;
    }
}
