package com.corejava;

import java.util.Scanner;

public class SelectionSort {
    public static void main(String[] args) {
        SelectionSort ql = new SelectionSort();
        System.out.println("Enter number of elements:");
        Scanner scanner = new Scanner(System.in);
        int totalElements = scanner.nextInt();

        int[] arrOfElements = new int[totalElements];
        for (int i = 0; i < totalElements; i++) {
            System.out.println("Enter " + i + "element:");
            Scanner scanner1 = new Scanner(System.in);
            arrOfElements[i] = scanner1.nextInt();
        }
        int minElement;
        int temp = 0;
        for(int i=0;i<totalElements;i++){
            minElement = i;
            for(int j = i+1;j<totalElements;j++){
                if(arrOfElements[j]<arrOfElements[minElement]){
                    minElement = j;
                }
            }
        //ql.swap(arrOfElements[i],arrOfElements[minElement]);
            temp = arrOfElements[minElement];
            arrOfElements[minElement] = arrOfElements[i];
            arrOfElements[i] = temp;
        }
        for(int i=0;i<totalElements;i++){
            System.out.println(arrOfElements[i]);
        }
    }

    void swap(int arrOfElement, int arrOfElement1) {
        int temp;
        temp = arrOfElement;
        arrOfElement = arrOfElement1;
        arrOfElement1 = temp;

    }

}

