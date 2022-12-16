package com.dn.corejava;

import javax.swing.*;
import java.util.Scanner;

public class Test15 {

    public static void main(String[] args){
        System.out.println("Enter number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int[] arrayOfOdds = new int[number];
        int oddNumber = 1;
        int sum = 0;
        for(int i=0;i<arrayOfOdds.length;i++){
            if(oddNumber%2!=0){
                arrayOfOdds[i] = oddNumber;
                sum = sum + arrayOfOdds[i];
                System.out.println(arrayOfOdds[i]);
                oddNumber = oddNumber+2;}
        }
        System.out.println("Sum of oddNumbers:"+sum);
    }
}
