package com.dn.corejava;

import java.util.Scanner;

public class Test22 {
    public static void main(String[] args){

        int numberOfRows;
        System.out.println("Enter number of rows:");
        Scanner scanner = new Scanner(System.in);
        numberOfRows = scanner.nextInt();

        for(int i = 1;i<=numberOfRows;i++){
            for(int j=1;j<=i;j++){
                if(j==1 || j==i)
                    System.out.print("1");
                else
                    System.out.print(i-1);
            }
            System.out.println();
        }
    }
}
