package com.corejava;

import java.util.Arrays;

public class RemoveDuplicateFromArray {

    public static void main(String[] args){
        int[] array = {1,3,1,5,2,4,3,2,1};

        int[] newArray = removeDuplicate(array);
        for(int i=0;i<newArray.length;i++){
            System.out.println(newArray[i]);
        }
    }

    private static int[] removeDuplicate(int[] array) {
        Arrays.sort(array);

        int temp = array[0];
        int count =0;
        for(int i=1;i<array.length;i++){
            if(temp == array[i]){
                count++;

            }
            temp = array[i];
        }

        int[] newArray = new int[array.length-count];
        newArray[0] = array[0];

        int temp1 = array[0];
        int j =1;
        for(int i=1;i<array.length;i++){
            if(temp1 != array[i]){
                newArray[j] = array[i];
                j++;
            }

            temp1 = array[i];
        }
        return newArray;
    }
}
