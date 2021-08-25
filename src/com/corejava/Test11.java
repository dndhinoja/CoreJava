package com.corejava;

import java.util.Scanner;

public class Test11 {
    public static void main(String[] args){
        System.out.println("Enter number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int sum =0;
        for(int i=number; i>=1;i--){
            System.out.println(i);

        }
        for(int j=number;j>=1;j--){
            sum = sum+j;
            System.out.print(sum);
        }
    }
}
