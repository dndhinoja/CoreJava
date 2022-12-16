package com.dn.corejava;

import java.util.Scanner;

public class Test4 {

    public static void main(String[] args){

        System.out.println("Enter floating value:");
        Scanner scanner = new Scanner(System.in);
        float value = scanner.nextFloat();

        int absoluteValue = (int) value;

        if(absoluteValue == 0){
            System.out.println("Zero");
        }
        else if(absoluteValue>0){
            if(absoluteValue<1)
                System.out.println("value is small positive");
            else if(absoluteValue>1000000)
                System.out.println("value is large positive");
            System.out.println("value is positive");
        }

    }
}


