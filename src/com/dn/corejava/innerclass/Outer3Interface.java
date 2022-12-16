package com.dn.corejava.innerclass;

public interface Outer3Interface {
    public void display();
}

class AnonymousOuter{
    Outer3Interface outer3Interface = new Outer3Interface() {
        @Override
        public void display() {
            System.out.println("AnonymousOuter");
        }
    };

    public static void main(String[] args) {
        AnonymousOuter anonymousOuter = new AnonymousOuter();
        anonymousOuter.outer3Interface.display();
    }
}
