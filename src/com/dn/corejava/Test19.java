package com.dn.corejava;

import java.util.Scanner;

public class Test19 {
    public static void main(String[] args){
        System.out.println("Enter number");
        Scanner scanner = new Scanner(System.in);
        int numberOfRow = scanner.nextInt();


        for(int i = 1;i<=numberOfRow;i++){
            for(int k =numberOfRow-1;k>i;k--){
                System.out.print(" ");
            }

            for(int j = 1;j<=i;j++){

                System.out.print(i);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
