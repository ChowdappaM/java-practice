package com.java8.practice.string;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test {

    public static void main(String... args) throws InterruptedException {
        List<Integer> numbers = Arrays.asList(2, 5, 6, 7, 8, 9, 3, 5,4,2,6,10, 11, 11, 5);
        Stream<Integer> data = numbers.stream();

        List<Integer> unique = data.distinct().collect(Collectors.toList());

        unique.forEach(n -> System.out.println(n));
        
        List<String> strs = Arrays.asList("a","b","c","d"); 
        String str = strs.stream().reduce((a,b)->a+"-"+b).get();
        System.out.println(str);
    }
}
