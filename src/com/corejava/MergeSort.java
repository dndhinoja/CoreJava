package com.corejava;

public class MergeSort {

    public static void main(String[] args){
        int[] arr = {3,1,10,2,90,30};

        MergeSort ms = new MergeSort();
        ms.mergeSort(arr,0,arr.length-1);

        //print result
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

    private void mergeSort(int[] arr,int start, int end) {
        if(start<end) {
            int middle = start + (end - start) / 2;

            //for divide
            mergeSort(arr, start, middle);
            mergeSort(arr, middle + 1, end);

            //for merging
            merge(arr, start, middle, end);
        }
    }

    private void merge(int[] arr, int start, int middle, int end) {
        int sizeForArr = (middle-start)+1;
        int sizeForArr1 = (end-middle);

        int[] tempArr = new int[sizeForArr];
        int count =start;
        for(int i=0;i<tempArr.length;i++){
            tempArr[i] = arr[count];
            count++;
            //System.out.println("first half"+tempArr[i]);
        }

        System.out.println("Now Second Half");

        int[] tempArr1 = new int[sizeForArr1];
        int count1=middle+1;
        for(int i=0;i<tempArr1.length;i++){
            tempArr1[i] = arr[count1];
            //System.out.println("Second Half"+tempArr1[i]);
            count1++;
        }

        int k=start;
        int i=0;
        int j=0;

        while(i<tempArr.length && j<tempArr1.length) {
            if (tempArr[i] < tempArr1[j]) {
                arr[k] = tempArr[i];
                i++;
            } else {
                arr[k] = tempArr1[j];
                j++;
            }
            k++;
        }

        while(i<tempArr.length){
            arr[k] = tempArr[i];
            i++;
            k++;
        }
        while (j<tempArr1.length){
            arr[k] = tempArr1[j];
            j++;
            k++;
        }
    }

}
