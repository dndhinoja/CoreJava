package com.corejava;

import java.util.Scanner;

public class Test14 {

    public static void main(String[] args){
        System.out.println("Enter number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        int result = 0;
        for(int i=0;i<=number;i++){
            result = number*i;
            System.out.println(number+"*"+i+"="+result);
        }
    }
}
