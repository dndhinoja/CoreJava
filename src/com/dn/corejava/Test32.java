package com.dn.corejava;

import java.util.Scanner;

public class Test32 {
    public static void main(String[] main){

        double number1;
        System.out.println("Enter no1");
        Scanner scanner = new Scanner(System.in);
        number1 = scanner.nextDouble();

        double number2;
        System.out.println("Enter no2");
        Scanner scanner1 = new Scanner(System.in);
        number2 = scanner1.nextDouble();

        if(number1%100==number2%100){
            System.out.println("same");
        }
        else{
            System.out.println("Different");
        }
    }
}
