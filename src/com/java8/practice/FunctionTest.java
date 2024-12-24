/**
 * 
 */
package com.java8.practice;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Q. What is the Function ? 
 * A. Function is the functional interface,to perform operation and return object. 
 * Q. When to use predicate?
 * A. Whenever to perform logical operation.
 */
public class FunctionTest {

    /**
     * @param args
     */
    public static void main(String[] args) {

        /**
         * 
         */
        Function<Integer, Integer> square = i -> i*i;
        List<Integer> numbers = Arrays.asList(1, 3,5,8, 9, 10);
        List<Integer> sqares = numbers.stream().map(square).collect(Collectors.toList());
        System.out.println(sqares);
    }

    
}
