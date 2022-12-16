package com.dn.corejava.innerclass;

public class Outer2 {

    static class Inner{
        public void display(){
            System.out.println("Hi from inner class..");
        }
    }
}

class staticInnerClass{
    public static void main(String[] args) {
        Outer2.Inner obj = new Outer2.Inner();
        obj.display();
    }
}
