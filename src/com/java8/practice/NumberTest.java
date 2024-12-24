package com.java8.practice;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class NumberTest {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,8,4,90,45,16);
        IntSummaryStatistics statastics =  numbers.stream().mapToInt((x)->x).summaryStatistics();
        System.out.println("Min "+ statastics.getMin());
        System.out.println("Max "+ statastics.getMax());
        System.out.println("Sum "+ statastics.getSum());
        System.out.println("Avarage "+statastics.getAverage());
        System.out.println("Count "+ statastics.getCount());
        
        statastics.accept(100);
        System.out.println("*********** After accepting 100****");
        System.out.println("Min "+ statastics.getMin());
        System.out.println("Max "+ statastics.getMax());
        System.out.println("Sum "+ statastics.getSum());
        System.out.println("Avarage "+statastics.getAverage());
        System.out.println("Count "+ statastics.getCount());
        
    }

}
