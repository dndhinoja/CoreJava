package com.dn.corejava.innerclass;

//method local inner class
public class Outer1 {

    void outerMethod(){
        int a = 0;
        class inner{
            int b = a;
            void innerMethod(){
                //int b = a+3;
                System.out.println("inner method: "+a+b);
            }
        }
        class inner1 extends inner{
            void innerMethod1(){
                super.innerMethod();
            }
        }
        inner inner= new inner();
        inner.innerMethod();
    }
}
class GFG{
    public static void main(String[] args) {
        Outer1 outer1 = new Outer1();
        outer1.outerMethod();
    }
}
