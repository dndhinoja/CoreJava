package com.dn.corejava;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListPractice {

    public static void main(String[] args){
        List<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(1);
        arrayList.add(10);
        arrayList.add(22);
        arrayList.add(3);

        int a = arrayList.get(2);
        System.out.println(a);

        List<Integer> linkedList = new LinkedList<>();
        linkedList.add(1);
        linkedList.add(10);
        linkedList.add(22);
        linkedList.add(3);

        int a1 = linkedList.get(2);
        System.out.println(a1);


    }
}
