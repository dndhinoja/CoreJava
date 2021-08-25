package com.corejava;

import java.util.Scanner;

public class Test30 {
    public static void main(String[] args){
        double number1;
        double number2;
        double number3;

        System.out.println("Enter no1:");
        Scanner scanner1 = new Scanner(System.in);
        number1 = scanner1.nextDouble();

        System.out.println("Enter no2:");
        Scanner scanner2 = new Scanner(System.in);
        number2 = scanner2.nextDouble();

        System.out.println("Enter no3:");
        Scanner scanner3 = new Scanner(System.in);
        number3 = scanner3.nextDouble();


        if(number1==number2){
            if(number1==number3){
                System.out.println("All numbers are equals");
            }
        }
        else if(number1!=number2){
                if(number1==number3){
                    System.out.println("All numbers neither diff nor equals");
                }
                else if(number2==number3){
                    System.out.println("All numbers neither diff nor equals");
                }
                else
                {
                    System.out.println("All numbers are different");
                }
        }
    }
}
