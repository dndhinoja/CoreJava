package com.dn.corejava;

public class PalindromeInteger {

    private Boolean isPalindromeInt(int number){
        int modulo;

        int originalNumber = number;
        String str = "";
        while(number!=0){
            modulo = number%10;
            number = number/10;
            str = str + modulo;
        }

        if(Integer.parseInt(str) == originalNumber)
            return true;
        return false;
    }
    public static void main(String[] args){
        PalindromeInteger palindromeString = new PalindromeInteger();
        System.out.println(palindromeString.isPalindromeInt(333322));
    }
}
