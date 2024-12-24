package com.java8.practice.string;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Set {

    public static void main(String[] args) {

        String str = "HelloFunctionalProgramingWorld";
        
        /**
         * Count occurrences of character in String.
         */
     
        
        List<String> chars = Arrays.asList(str.split(""));
        Map<String, Long> result = 
                chars.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(result);
        /**
         * Find repeated chars
         */
        List<String> duplicateChars =
                result.entrySet().stream().filter(
                        n->{return n.getValue()>1;}).map(Map.Entry::getKey).collect(Collectors.toList());
        System.out.println(duplicateChars);
        
        /**
         * First non repeating element.
         * We need to use LinkedHashMap to follow insertion order.
         */
        String firstChar = chars.stream().collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
        .entrySet().stream().filter(n->n.getValue()==1).map(Map.Entry::getKey) .findFirst().get();
        
        System.out.println(firstChar);
    }

}
