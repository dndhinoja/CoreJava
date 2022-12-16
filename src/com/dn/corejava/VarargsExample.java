package com.dn.corejava;

public class VarargsExample {

    public static void fun(int... a){
        for (int i: a)
            System.out.println(i);
    }

    public static void main(String[] args) {
        fun(1,2,3);
    }
}
