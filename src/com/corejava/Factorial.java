package com.corejava;

public class Factorial {

    public static void main(String[] args){
        Factorial factorial = new Factorial();
        int factorialOfNumber = factorial.factorial(4);
        System.out.println(factorialOfNumber);
        int types = factorial.climbStairs(5);
        System.out.println(types);
    }

    private int factorial(int number) {
        if(number!=0)
            return number*factorial(number-1);
        return 1;
    }

    private int climbStairs(int n) {
        if(n==1){
            return 1;
        }
        if(n==2){
            return 2;
        }
        return climbStairs(n-1)+ climbStairs(n-2);
    }
}
