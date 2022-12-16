package com.dn.Java8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateWithConsumer {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);list.add(3);list.add(1);list.add(10);

        Predicate<Integer> predicate = i -> i<10;

        list.forEach(x -> {
            if(predicate.test(x))
                System.out.println(x);
                });
        //{if(predicate.test(x))
          //  System.out.println(x));
    }
}
