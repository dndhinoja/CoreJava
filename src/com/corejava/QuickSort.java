package com.corejava;

public class QuickSort {
    public static void main(String[] args){
        int[] arr = {20,10,90,41,30};

        QuickSort qs = new QuickSort();
        qs.quickSort(arr,0,arr.length-1);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }
    public void quickSort(int[] arr, int start, int end){
        if(start<end) {
            int partitionIndex = partition(arr, start, end);
            quickSort(arr, start, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, end);
        }
    }

    private int partition(int[] arr, int start, int end) {
        int i = start-1;
        int pivot = arr[end];
        for(int j=start;j<end;j++){
            if(arr[j]<pivot){
                i++;
                //swap
                int temp = arr[j];
                arr[j] = arr[i];
                arr[i] = temp;
            }
        }
        //swap
        int temp1 = arr[end];
        arr[end] = arr[i+1];
        arr[i+1] = temp1;
        return i+1;
    }
}
