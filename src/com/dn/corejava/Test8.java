package com.dn.corejava;

import java.util.Scanner;

public class Test8 {

    public static void main(String[] args){
        System.out.println("Enter alphabet:");
        Scanner scanner = new Scanner(System.in);
       // char alphabet = (char) scanner.nextByte();
        String alphabet = scanner.next();
        if(alphabet.length()>1)
            System.out.println("Error");
        String[] arrayOfAlphabets = {"a","e","i","o","u"};
       // char[] arrayOfAlphabets = {'a','e','i','o','u','A','E','I','O','U'};

        for(int i=0;i<arrayOfAlphabets.length;i++)
        {
            if(alphabet.equals(arrayOfAlphabets[i])){
                System.out.println("Vowel");
                break;
            }
            if(i==arrayOfAlphabets.length-1)
                System.out.println("Consonant");
        }

    }
}
