package com.dn.corejava;

public class BinarySearch {

    public static void main(String[] args){
        BinarySearch bs = new BinarySearch();

        int[] arr = {3,11,22,33,44,55};
        int x = 33;
        int element = bs.binarySearch(arr,0,arr.length-1,x);

        System.out.println(element);
        //for (int i=0;i<arr.length;i++){
          //  System.out.println(arr[i]);
        //}
    }
    public int binarySearch(int[] arr,int start,int end,int search){
        int x=0;
        int mid = start + (end-start)/2;
        if(arr[mid]==search){
            x = mid;
            return x;
        }
        else if(arr[mid]<search){
            x = binarySearch(arr,mid+1,end,search);
            return x;
        }
        else
        {
            x = binarySearch(arr,start,mid,search);
            return x;
        }
    }
}
