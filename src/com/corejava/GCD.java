package com.corejava;

public class GCD {

    public static void main(String[] args){
        GCD gcd = new GCD();
        int GCD = gcd.gcdOfNumber(15,12);
        System.out.println(GCD);
    }
//with recursion and without recursion
    private int gcdOfNumber(int X, int Y) {
        int x = X;
        if(Y!=0) {
            X = Y;
            Y = x % Y;
            x = X;
        }
        else {
            return X;
        }
        return  gcdOfNumber(X,Y);
    }
}
