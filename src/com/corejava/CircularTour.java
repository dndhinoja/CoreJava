package com.corejava;

public class CircularTour {

    public static void main(String[] args){
        int[] distance = {6,5,3,5};
        int[] amountOfPetrol = {4,6,7,4};

        CircularTour ct = new CircularTour();
        int numberOfPetrolPump = ct.tour(amountOfPetrol,distance);
        System.out.println(numberOfPetrolPump);
    }
    int count =0;
    private int tour(int[] amountOfPetrol, int[] distance) {

        int extraPetrol = 0;

        for(int i=0;i<amountOfPetrol.length;i++){

                amountOfPetrol[i] = extraPetrol+amountOfPetrol[i];
                if(amountOfPetrol[i]>distance[i]){
                    extraPetrol = amountOfPetrol[i]-distance[i];
                }
                else {
                   //rotating Array Logic
                    count++;
                  int[] newAmountOfPetrol = rotatingArray(amountOfPetrol,1);
                  int [] newDistance = rotatingArray(distance,1);
                  tour(newAmountOfPetrol,newDistance);
                  break;
                }
        }
            return count;
    }

    private int[] rotatingArray(int[] arr, int rotateBy) {
        for(int i = 0;i<rotateBy;i++){
            int temp = arr[0];
            for(int j=1;j<arr.length;j++){
                arr[j-1] = arr[j];
                if(j == arr.length-1){
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }
}
