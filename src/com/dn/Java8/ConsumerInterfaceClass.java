package com.dn.Java8;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerInterfaceClass {
    public static void main(String[] args) {

        //User defined Consumer Interface
        ConsumerInterface consumerInterface = (a,b) -> a+b;
        System.out.println(consumerInterface.add(2,3));

        //By default consumer Interface
        Consumer<Integer> consumer = (x) -> System.out.println("Hi "+x);
        consumer.accept(20);

        BiConsumer<Integer, Integer> biConsumer = (x,y) -> System.out.println("Hi "+(x+y));
        biConsumer.accept(2,4);

        List<Integer> list = new ArrayList<>();
        list.add(1);list.add(2);list.add(3);list.add(4);list.add(5);
        Queue<Integer> queue = new ArrayDeque<>();queue.add(2);

        //iteration over list using lambda
        list.forEach((i)-> System.out.println("value: "+i));
        //iteration over list without lambda
        for (int i: list)
            System.out.println("1 value: "+i);

        queue.forEach((i) -> System.out.println("Queue Value: "+i));

        //Biconsumer with foreach
        list.forEach(i -> biConsumer.accept(2, i));
    }
}
