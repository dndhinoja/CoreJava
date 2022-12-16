package com.dn.corejava;

public class GenericExample{

    public static <T> void printGenericArray(T[] items){
        for (T item: items)
            System.out.println(item.getClass().getName()+"="+item);
        System.out.println();
    }

    public static void main(String[] args) {
        MyGenericClass<Integer> m_int = new MyGenericClass<Integer>();
        m_int.add(10);
        System.out.println(m_int.get());

        //--------------------------------
        System.out.println();

        Integer[] int_Array = {1,2,3,4,5,6,7,8};
        printGenericArray(int_Array);

        Character[] char_Array = {'a','b','c','d'};
        printGenericArray(char_Array);

        //--------------------------------
        Integer[] int_Array1 = {1,2,3,4,5,6,7,8};
        MyGenericClass1<Integer> m = new MyGenericClass1<Integer>();
        m.add(1);
        System.out.println(m.get());
    }
}
class MyGenericClass<E>{
    E obj;
    void add(E obj){
        this.obj = obj;
    }
    E get(){
        return obj;
    }
}

class MyGenericClass1<N> {
    N obj;
    void add(N obj){
        this.obj = obj;
    }
    N get(){
        return obj;
    }
}
