package com.java8.practice.fi;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class PredicateTest {

    public static void main(String... args) {
        Predicate<Integer> evenPredicate = new Predicate<Integer>() {

            @Override
            public boolean test(Integer t) {
                if (t / 10 == 0)
                    return true;
                return false;
            }
        };
        
        System.out.println(evenPredicate.test(12));
        System.out.println(evenPredicate.test(13));
        
        Predicate<String> p1 = (str)->str.length()>2;
        Predicate<String> p2 = (str)-> str.equals("ABCD");
        
        System.out.println(p1.and(p2).test("ABCD"));
        
        
        BiPredicate<String, String> biP1 = (str1, str2)->{System.out.println("In equals compare"); return str1.equalsIgnoreCase(str2);};
        
        BiPredicate<String, String> biP2 = (str1, str2)->{System.out.println("In length compare"); return str1.length()==str2.length();};
        
        System.out.println(biP2.and(biP1).test("test", "TEST1"));
        
        /*
         * if p2 predicate returns false, then p1 will not execute.
         */
        
        /**
         * If P2 returns false, it will execute P1.
         * If P2 returns true, it will not execute P1.
         */
        
        System.out.println(biP2.or(biP1).test("test", "TEST1"));
        System.out.println(biP2.or(biP1).test("test", "abcd"));
        
       System.out.println(Predicate.isEqual("Test").test("Test"));


    }
}
