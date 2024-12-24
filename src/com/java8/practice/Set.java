package com.java8.practice.numbers;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.LongSummaryStatistics;
import java.util.stream.Collectors;

public class Set {

    public static void main(String[] args) {
        
        List<Integer> numbers = Arrays.asList(1,2,3,45,64,78,38,45,70,100, 44, 42, 40, 48, 54, 64, 84, 104);
        Integer sum = numbers.stream().reduce((a,b)->a+b).get();
        System.out.println(sum);
        
        Integer prd = numbers.stream().reduce((a,b)->a*b).get();
        System.out.println(prd);
        
        /**
         * Average of all numbers..
         */
        // Transform-> map
        numbers.stream().mapToDouble(n->n).average();
        
        /**
         * Even and odd numbers.
         */
        
        
        List<Integer> evens = numbers.stream().filter(n->n%2==0).collect(Collectors.toList());
        System.out.println(evens);
        
        List<Integer> odds = numbers.stream().filter(n->n%2!=0).collect(Collectors.toList());
        System.out.println(odds);
        
        /**
         * print the numbers start with 4.
         */
        
        List<String> result = numbers.stream().map(n->n.toString()).filter(n->n.startsWith("4")).collect(Collectors.toList());
        System.out.println(result);
        
        
        /**
         * Skip first 5 numbers..
         */
        List<Integer> remaining = numbers.stream().skip(5).collect(Collectors.toList());
        System.out.println(remaining);
        
        /**
         * Statastics..
         */
        
       LongSummaryStatistics stats = numbers.stream().mapToLong(n->n).summaryStatistics();
       System.out.println(stats);
       
       System.out.println("Min and Max of a number:");
       /**
        * Min and Max
        */
       int min = numbers.stream().min(Comparator.comparing(Integer::valueOf)).get();
       System.out.println(min);
       System.out.println(stats.getMin());
       
       int max = numbers.stream().max(Comparator.comparing(Integer::valueOf)).get();
       System.out.println(max);
       System.out.println(stats.getMax());
      
      System.out.println("Ascending and descending order..");
       /**
        * Asc and Desc
        */
       
       List<Integer> ascOrder =  numbers.stream().sorted().collect(Collectors.toList());
       System.out.println(ascOrder);
       
       List<Integer> descOrder =  numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
       System.out.println(descOrder);
       
       System.out.println("Second highest number********");
       
       /**
        * Second highest.
        */
       
       /**
        * Sort the numbers in reverse order, skip the first number and collect second number.
        */
       List<Integer> sortedList = numbers.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
       
       int secondHighest = sortedList.get(1);
       int secondLowest = sortedList.get(numbers.size()-2);

       System.out.println(secondLowest);
       System.out.println(secondHighest);
       
    }

}
