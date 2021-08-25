package com.corejava;

public class PrimeNumber {


    public static void main(String[] args){
    PrimeNumber primeNumber = new PrimeNumber();
        System.out.println(primeNumber.isPrimeNumber(25 ));
    }

    boolean flag = true;
    private Boolean isPrimeNumber(int number) {
        if(number==2){
            return flag;
        }
        if(number<=1)
        {
            flag = false;
             return flag;
        }
        //even numbers
        if(number%2==0){
            return flag;
        }
        int sqrt = (int) Math.sqrt(number);
        for(int i=3 ;i<=sqrt;i+=2){
            if(number%i==0)
                flag = false;
        }
        return flag;
    }
}
