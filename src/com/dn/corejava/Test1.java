package com.dn.corejava;

import java.util.Scanner;

public class Test1 {

    public static void main(String[] args){

        System.out.println("Enter number");
        Scanner scanner = new Scanner(System.in);

        int number = scanner.nextInt();

        if(number<0){
            System.out.println("Entered number is negative");
        }
        else if(number>0){
            System.out.println("Entered number is positive");
        }
        else
        {
            System.out.println("Enter number again");
        }
    }
}
