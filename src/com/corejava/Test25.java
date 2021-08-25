package com.corejava;

import java.util.Scanner;

public class Test25 {
    public static void main(String[] args){
        System.out.println("Enter number");
        int number;
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();


        for(int i = 1;i<=number;i++){
            for(int k = number-1;k>=i;k--){       //for pattern space
                System.out.print(" ");
            }
                for(int k=i;k>=1;k--){
                    System.out.print(k);
                }
                for(int j=2;j<=i;j++){
                    System.out.print(j);
                }
            System.out.println();
        }
        for(int i = number-1    ;i>=1;i--){
            for(int k = i;k<=number-1;k++){
                System.out.print(" ");
            }
            for(int k=i;k>=1;k--){
                System.out.print(k);
            }
            for(int j=2;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }






    }
}
