package com.dn.Java8;

import java.util.function.Function;

public class FunctionWithOtherMethodsOfIt {

    public static void main(String[] args) {
        Function<Integer, Integer> function1 = (x) -> x * 4;
        System.out.println(function1.apply(12));
        Function<Integer, Integer> function2 = (x) -> x / 2;

        Function<Integer, Integer> function3 = function1.andThen(function2);
        Function<Integer, Integer> function4 = function1.compose(function2);

        System.out.println(function3.apply(11));
        System.out.println(function4.apply(11));

    }
}
