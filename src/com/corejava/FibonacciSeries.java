package com.corejava;

public class FibonacciSeries {
  int a = 0;
  int b =1;
  int c = 0;
    /*private void fibonacci(int upTo) {
        for(int i=0;i<upTo;i++){
            c = a+b;
            b= a;
            a = c;
            System.out.println(c);
        }
    }*/
    int counter=0;
    private void fibonacciRecursion(int upTo){
        c =a+b;
        b= a;
        a = c;
        System.out.println(c);
        counter++;
        if(counter==upTo)
            return;
        fibonacciRecursion(upTo);
    }


    public static void main(String[] args){
        FibonacciSeries fibonacciSeries = new FibonacciSeries();
       // fibonacciSeries.fibonacci(10);
        fibonacciSeries.fibonacciRecursion(10);
    }


}
