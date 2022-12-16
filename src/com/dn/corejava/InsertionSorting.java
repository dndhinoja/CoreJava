package com.dn.corejava;

public class InsertionSorting {
    public static void main(String[] args){
        int[] arr = {3,6,2,7,5};

        int position=0;
        for(int i=1;i<arr.length;i++){
            int key = arr[i];
            position=i;
            for(int j = i-1;j>=0;j--){
                if(key<arr[j]){
                    arr[j+1] = arr[j];
                    position = j;
                }

            }
            arr[position] = key;
        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
