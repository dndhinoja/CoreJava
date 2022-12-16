package com.dn.corejava;

import com.sun.source.tree.SwitchTree;

import java.util.Scanner;

public class Test5 {

    public static void main(String[] args){
        int number;
        System.out.println("Enter number between 1 to 7");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();

        switch(number){
            case '1':
                System.out.println("Monday");
                break;
            case '2':
                System.out.println("Tuesday");
                break;
            case '3':
                System.out.println("Wednesday");
                break;
            case '4':
                System.out.println("Thursday");
                break;
            case '5':
                System.out.println("Friday");
                break;
            case '6':
                System.out.println("Saturday");
                break;
            case '7':
                System.out.println("Sunday");
                break;
        }
    }
}
