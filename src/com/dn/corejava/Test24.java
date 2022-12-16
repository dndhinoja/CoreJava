package com.dn.corejava;

import java.util.Scanner;

public class Test24 {
    public static void main(String[] args){
        int numberOfRows;
        System.out.println("Enter number:");
        Scanner scanner = new Scanner(System.in);
        numberOfRows = scanner.nextInt();

        for(int i=1;i<=numberOfRows;i++){
            for(int k =numberOfRows-1;k>=i;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print("@");
                //System.out.print(" ");
            }
            System.out.println();
        }
    }
}
