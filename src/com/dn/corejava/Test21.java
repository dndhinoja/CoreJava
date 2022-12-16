package com.dn.corejava;

import java.util.Scanner;

public class Test21 {
    public static void main(String[] main){
        System.out.println("Enter number for Diamond:");
        Scanner scanner = new Scanner(System.in);
        int halfDiamondNumber = scanner.nextInt();

        for(int i=1;i<=halfDiamondNumber;i++){
            for(int k=halfDiamondNumber-1;k>i;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
