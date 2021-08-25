package com.corejava;

import java.util.Scanner;

public class Test13 {

    public static void main(String[] args){
        System.out.println("Enter number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int[] arrayOfNumber = new int[number];
        int[] cubeOfNumber = new int[number];

        int temp =1;
        int j = 0;
        while(temp<=number){
            arrayOfNumber[j] = temp;
            j++;
            temp++;
        }
        for(int i = 0;i<arrayOfNumber.length;i++){
            cubeOfNumber[i] = arrayOfNumber[i]*arrayOfNumber[i]*arrayOfNumber[i];
            System.out.println("Number is :"+arrayOfNumber[i]+"and cube of 1 is :"+cubeOfNumber[i]);
        }
    }
}
