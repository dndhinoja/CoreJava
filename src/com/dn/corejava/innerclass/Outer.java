package com.dn.corejava.innerclass;


//nested inner class
public class Outer {
    private int i = 0;

    class Inner{
        public void show(){
            System.out.println("Hi "+i);
        }
    }
}

class Main{
    public static void main(String[] args) {
        Outer.Inner inner = new Outer().new Inner();
        inner.show();
    }
}
