package com.dn.corejava;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class GenericExample3 {

    private static Number upperBoundedWildcards(List<? extends Number> numbers){
        double sum = 0.0;
        for (Number n : numbers)
            sum+= n.doubleValue();
        return sum;
    }

    public static void lowerBoundedWildcards(List<? super Integer> nums){
        System.out.println(nums);
    }

    public static <N extends Number> double multiply(N x, N y){
        return x.doubleValue() * y.doubleValue();
    }

    public static void main(String[] args) {

        List<Integer> int_list = Arrays.asList(1,2,3,4,5,6,7);
        System.out.println(upperBoundedWildcards(int_list));

        System.out.println("-------lower bounded wild cards-----------");

        List<Integer> int_list1 = Arrays.asList(1,2,3,4,5);
        lowerBoundedWildcards(int_list1);

        List<Number> num_list = Arrays.asList(2,3,4,5);
        lowerBoundedWildcards(num_list);

        Integer x = Integer.valueOf(10);
        Double y = new Double(2.5);
        System.out.println(multiply(x, y));
    }
}
