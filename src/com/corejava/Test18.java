package com.corejava;

import java.util.Scanner;

public class Test18 {
    public static void main(String[] args){
        System.out.println("Enter number:");
        Scanner scanner = new Scanner(System.in);
        int numberOfRows = scanner.nextInt();

        int n = 1;
        for(int i=1;i<=numberOfRows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(n);
                n++;
            }
            System.out.println();
        }
    }
}
