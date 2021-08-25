package com.corejava;

import java.util.Scanner;

public class Test16 {
    public static void main(String[] args){
        System.out.println("Enter number of rows:");
        Scanner scanner = new Scanner(System.in);
        int numberOfRows = scanner.nextInt();

        for(int i = 1;i<=numberOfRows;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);

            }
            System.out.println();
        }
    }
}
