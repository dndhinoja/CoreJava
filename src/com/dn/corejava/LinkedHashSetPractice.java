package com.dn.corejava;

import java.util.*;

public class LinkedHashSetPractice {



    public static void main(String[] args){
        Set<Integer> set = new HashSet<>(3);
        set.add(20);
        set.add(2);
        set.add(3);
        set.add(1);
        LinkedList list = new LinkedList(set);
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.printf(iterator.next().toString());
        }

    }
}
