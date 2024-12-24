package com.java8.practice.fi;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class FunctionalIntfTest {

    public static <U> void main(String[] args) {

       Random randomIntGen = new Random(0);
        /**
         * Consume the each value from collection.
         */
        Consumer<Integer> consumer = new Consumer<Integer>() {
            
            @Override
            public void accept(Integer t) {
                
            }
        };
        
        /**
         * Function is to apply a logic to your number.
         */
        Function<Integer, Integer> function = new Function<Integer, Integer>() {
            
            @Override
            public Integer apply(Integer t) {
                return null;
            }
        };
        
        /**
         * Predicate to test a condition.
         */
        
        Predicate<Integer> predicate = new Predicate<Integer>() {
            
            @Override
            public boolean test(Integer t) {
                return false;
            }
        };
        
        /**
         * Get additional details (Some number) to collection. (Supply a number)
         */
        Supplier<Integer> supplier = new Supplier<Integer>() {
            
            @Override
            public Integer get() {
                return randomIntGen.nextInt();
            }
        };
        
        List<Integer> records = new ArrayList<Integer>();
        
        BiConsumer<Integer, Integer> accumulator = new BiConsumer<Integer, Integer>() {

            @Override
            public void accept(Integer t, Integer u) {
                System.out.println(" T + U ="+ (t+u));
            }
        };
        BiConsumer<Integer, Integer> combiner = new BiConsumer<Integer, Integer>() {

            @Override
            public void accept(Integer t, Integer u) {
                System.out.println(" T + U ="+ (t+u));
            }
        };
        Integer resultt = records.stream().collect(supplier, accumulator, combiner);
        System.out.println(resultt);
    }

}
