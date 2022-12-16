package com.dn.corejava;

import java.util.Scanner;

public class ReplaceByX {

    public static void main(String[] args){
        System.out.println("Enter String:");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        System.out.println("Enter string for compare");
        Scanner scanner1 = new Scanner(System.in);
        String str1 = scanner1.next();
        if(str.contains(str1)){
            String replacedString = str.replace(str1,"X");
            System.out.println(replacedString);
        }
    }
}
