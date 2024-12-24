package com.java8.practice.fi;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class BiConsumerTest {

    public static void main(String[] args) {

        Consumer<String> upperCase = (str) -> {System.out.println(str.toUpperCase());};
        Consumer<String> lenghtCon = (str) -> {System.out.println(str.length());};
        
        BiConsumer<String, Integer> consumer = (t, u) -> {System.out.println(t.toUpperCase()+u);};
        consumer.accept("Hello", 123);
        
        upperCase.andThen(lenghtCon).accept("hello");
        
        BiConsumer<String, Integer> increment = (emp, sal)-> {System.out.println(emp + (sal+sal*10/100));};
        
        consumer.andThen(increment).accept("Hello", 1234);
    }

}
