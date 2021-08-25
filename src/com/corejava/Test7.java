package com.corejava;

import java.util.Scanner;

public class Test7 {
    public static void main(String[] args){
        System.out.println("Enter number of month");
        Scanner scanner = new Scanner(System.in);
        int month = scanner.nextInt();

        System.out.println("Enter number of year");
        Scanner scanner1 = new Scanner(System.in);
        double year = scanner.nextDouble();


        switch (month){
            case '1':
                System.out.println(month+year+"31 days");
            case '2':
                System.out.println(month);
                if(year%4==0)
                    System.out.println(year+"29 days");
                else
                    System.out.println(year+"28 days");
            case '4':
                System.out.println(month+year+"30 days");
        }



    }
}
