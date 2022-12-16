package com.dn.corejava;

import java.util.Scanner;

public class Test12 {

    public static void main(String args[]){

        int[] number = new int[5];
        System.out.println("Enter 5 numbers");
        int sum = 0;
        for(int i= 0;i<5;i++){
            Scanner scanner = new Scanner(System.in);
            number[i] = scanner.nextInt();
            sum = sum+number[i];
        }
        System.out.println(sum);
        float average = sum/number.length;
        System.out.println(average);

    }
}
