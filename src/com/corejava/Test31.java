package com.corejava;

import java.util.Scanner;

public class Test31 {
    public static void main(String[] args){
        double number1;
        double number2;
        double number3;

        System.out.println("Enter no1:");
        Scanner scanner = new Scanner(System.in);
        number1 = scanner.nextDouble();

        System.out.println("Enter no2:");
        Scanner scanner1 = new Scanner(System.in);
        number2 = scanner1.nextDouble();

        System.out.println("Enter no3:");
        Scanner scanner2 = new Scanner(System.in);
        number3 = scanner2.nextDouble();

        if(number2-number1>0){
            if(number3-number2>0){
                System.out.println("numbers are increasing order");
            }
            else{
                System.out.println("neither increasing nor decreasing");
            }
        }
        else if(number2-number1<0){
            if(number3-number2>0) {
                System.out.println("neither increasing nor decreasing");
            }
            else{
                System.out.println("decreasing order");
            }
        }
    }
}
