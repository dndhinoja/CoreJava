package com.dn.corejava;

public class GenericExample2 {
    public static void main(String[] args) {
        MyGenericClass2<Integer, String> int_string = new MyGenericClass2<>(10,"Hello");
        int_string.print();
    }
}
class MyGenericClass2<T1,T2>{
    T1 obj1;
    T2 obj2;

    public MyGenericClass2(T1 obj1, T2 obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public void print(){
        System.out.println(obj1);
        System.out.println(obj2);
    }
}
