package com.dn.corejava;

public class GenericExample4 {

    Object obj;

    public Object getObj() {
        return obj;
    }

    public void setObj(Object obj) {
        this.obj = obj;
    }

    public static void main(String[] args) {
        GenericExample4 genericExample4 = new GenericExample4();
        genericExample4.setObj("abc");
        String a = (String) genericExample4.getObj();
        System.out.println(a);

        @SuppressWarnings("rawtypes")
        MyGenericClass3 myGenericClass3 = new MyGenericClass3();

    }
}

class MyGenericClass3<T>{
    T obj;

    public T getObj() {
        return obj;
    }

    public void setObj(T obj) {
        this.obj = obj;
    }
}
