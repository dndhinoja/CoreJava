package com.dn.corejava;

import java.util.Scanner;

public class Test9 {

    public static void main(String[] args){

        System.out.println("Enter year:");
        Scanner scanner = new Scanner(System.in);
        double year = scanner.nextDouble();

        if(year%4==0)
            System.out.println("Leap Year");
        else
            System.out.println("not leap year");
    }
}
