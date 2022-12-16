package com.dn.corejava;

public class MyRunnable extends Thread{
    @Override
    public void run() {
        int localVar1 = 45;

        MyObject localVar2 = MyObject.myObjectInstance;

        System.out.println("In Method One");

        mySecondMethod();

    }

    private void mySecondMethod() {

        Integer localVar1 = new Integer(22);

        System.out.println("In second Method");
    }
}
