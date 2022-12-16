package com.dn.corejava;

import java.util.Scanner;

public class RotatingArray {
    public static void main(String[] args){

        int N;
        System.out.println("Enter size of Array:");
        Scanner scanner = new Scanner(System.in);
        N = scanner.nextInt();

        int[] numbers = new int[N];

        Scanner scanner1 = new Scanner(System.in);
        for(int i=0;i<N;i++){
            System.out.println("Enter element"+i+"for rotating");
            numbers[i] = scanner1.nextInt();
        }

        //Rotating
        int D;
        System.out.println("Enter size of Rotation:");
        Scanner scanner2 = new Scanner(System.in);
        D = scanner2.nextInt();

        //Rotating Logic
            for(int i = 0;i<D;i++){
                int temp = numbers[0];
                    for(int j=1;j<N;j++){
                        numbers[j-1] = numbers[j];
                            if(j == N-1){
                                numbers[j] = temp;
                            }
                    }
            }

            for(int i = 0;i<N;i++){
                System.out.print(" ");
                System.out.print(numbers[i]);
            }
        }
    }
