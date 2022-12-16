package com.dn.corejava;

import java.util.Scanner;

public class Test3 {

    public static void main(String[] args) {

        int[] number = new int[3];
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < number.length; i++) {
            System.out.println("Enter"+i+" number:");
            number[i] = scanner.nextInt();
        }

        int temp = 0;
        for(int i=0;i<number.length-1;i++){
            if(temp<number[i+1]){
                temp = number[i+1];
            }
            else
            {
                temp = number[i];
            }
            if(i == number.length-2){
                System.out.println(temp);
                break;
            }
        }



    }
}