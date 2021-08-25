package com.corejava;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicateWithCollection {

    public static void main(String[] args){
        List<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(2);
        arrayList.add(1);
        arrayList.add(9);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(2);
        arrayList.add(5);

        //List<Integer> newArrayList =
                removeDuplicate(arrayList);

    }

    private static void removeDuplicate(List<Integer> arrayList) {
        Set<Integer> set = new LinkedHashSet<>(arrayList);

        List<Integer> newArrayList = new ArrayList<>(set);
    }
}
