/**
 * 
 */
package com.java8.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

/**
 * Q. What is the Predicate ? 
 * A. Predicate is the functional interface,to test
 * the expression and return boolean. 
 * Q. When to use predicate?
 * A. Whenever to perform logical operation.
 */
public class PredicateTest {

    /**
     * @param args
     */
    public static void main(String[] args) {

        /*
         * Predicate to test weather given number is even or not.
         */
        Predicate<Integer> predicate = i -> i % 2 == 0;
        System.out.println(predicate.test(2));
        
        /*
         * Predicate to use if any -ve number there in given list. 
         */
        Predicate<Integer> negativePredictor = i -> i < 0;
        List<Integer> numbers = Arrays.asList(1,4,3,9,-5,2,10,-34);
        Optional<Integer> nagativeNumber = numbers.stream().filter(negativePredictor).findFirst();
        if(nagativeNumber.isPresent()) {
            System.out.println(nagativeNumber.get());
        }
    }

}
