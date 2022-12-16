package com.dn.corejava;

public class StringTest {

    public static void main(String[] args) {

        String s1 = "iByteDipali";
        String s2 = new String("iByteDipali");
        String s3 = s2.intern();

        System.out.println(s1==s2);
        System.out.println(s2==s3);
        System.out.println(s3==s1);
    }
}
