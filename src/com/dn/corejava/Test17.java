package com.dn.corejava;

import java.util.Scanner;

public class Test17 {
    public static void main(String[] args){
        System.out.println("Enter number:");
        Scanner scanner = new Scanner(System.in);
        int numberOfRows = scanner.nextInt();

        for(int i=1;i<=numberOfRows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
