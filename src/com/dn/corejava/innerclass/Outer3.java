package com.dn.corejava.innerclass;

public class Outer3 {
    public void show(){
        System.out.println("Outer 3");
    }
}
    class AnonymousOuter3{
        Outer3 outer3 = new Outer3(){
          public void show(){
            super.show();
              System.out.println("Anonymous outer 3");
          }
        };

        public static void main(String[] args) {
            AnonymousOuter3 anonymousOuter3 = new AnonymousOuter3();
            anonymousOuter3.outer3.show();
        }
    }

