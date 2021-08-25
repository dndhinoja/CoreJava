package com.corejava;

public class SquareRootUsingNewton {
    private double sqrt(int n, double l) {
        double x = 6;
        double r;

        while (true) {
            r = 0.5 * (x + (n / x));
            if (Math.abs(r - x) < l) {
                break;
            }
            x = r;
        }
        return r;
    }


    public static void main(String[] args){
        SquareRootUsingNewton squareRootUsingNewton = new SquareRootUsingNewton();

        System.out.println(squareRootUsingNewton.sqrt(16,0.000001));
    }


}
