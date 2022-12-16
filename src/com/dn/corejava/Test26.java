package com.dn.corejava;

import java.util.Scanner;

public class Test26 {
    public static void main(String[] args){
        System.out.println("Enter number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        String[] arrayOfAlphabets = {"A","B","C","D","E","F","G"};

        for(int i=0;i<number;i++){
            for(int k=number;k>=i+1;k--){
                System.out.print(" ");
            }

            for(int j=0;j<=i;j++){
                System.out.print(arrayOfAlphabets[j]);
            }
            for(int l=i-1;l>=0;l--){
                System.out.print(arrayOfAlphabets[l]);
            }
            System.out.println();
        }

        for(int i=number-1;i>=0;i--){
            for(int k=i-1;k<number;k++){
                System.out.print(" ");
            }
            for(int j=0;j<i;j++){
                System.out.print(arrayOfAlphabets[j]);
            }
            for (int l=i-2;l>=0;l--){
                System.out.print(arrayOfAlphabets[l]);
            }
            System.out.println();
        }
    }
}
