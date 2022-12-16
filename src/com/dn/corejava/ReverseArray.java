package com.dn.corejava;

import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args){
        System.out.println("Enter size of Array:");
        Scanner scanner = new Scanner(System.in);
        int sizeOfArray = scanner.nextInt();

        int[] arrayOfNumbers = new int[sizeOfArray];
        for(int i=0;i<sizeOfArray;i++){
            System.out.println("Enter"+i+"number");
            Scanner scanner1 = new Scanner(System.in);
            arrayOfNumbers[i] = scanner1.nextInt();
            //System.out.println(arrayOfNumbers[i]);
        }
        int[] tempArray = new int[sizeOfArray];
       int k =0;
            for(int j=sizeOfArray-1;j>=0;j--){
                tempArray[k] = arrayOfNumbers[j];
                k++;
                //tempArray[i] = arrayOfNumbers[j];
            }
            for(int i=0;i<sizeOfArray;i++){
                System.out.print(tempArray[i]);
            }

    }
}
