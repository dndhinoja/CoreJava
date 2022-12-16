package com.dn.corejava;

import java.util.Scanner;

public class Test29 {
    public static void main(String[] args){
        System.out.println("Enter number");
        Scanner scanner = new Scanner(System.in);
        double number = scanner.nextDouble();

        int n =10;
        int result = (int) (number/n);
        if(result<=0)
            System.out.println("1 digit");

        int count =1;
        while(result>0) {
            n = n * 10;
            result = (int) (number/n);
            count++;
        }
        System.out.println(count);
        }
    }
