package com.java8.practice.string;

import static java.util.stream.Collectors.toList;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Result {

    /*
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        /*
         * int positiveCount = arr.stream().filter(n->
         * n>0).collect(Collectors.toList()).size();
         * 
         * int negativeCount = arr.stream().filter(n->
         * n<0).collect(Collectors.toList()).size(); int zerCount = arr.size() -
         * positiveCount - negativeCount; NumberFormat formatter = new
         * DecimalFormat("#0.0000000");
         * 
         * Double size = Double.valueOf(arr.size());
         * System.out.println(formatter.format(positiveCount/size));
         * System.out.println(formatter.format(negativeCount/size));
         * System.out.println(formatter.format(zerCount/size));
         */
        
        System.out.format("%0.0000f", 4.5);
        

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        /*
         * BufferedReader bufferedReader = new BufferedReader(new
         * InputStreamReader(System.in));
         * 
         * int n = Integer.parseInt(bufferedReader.readLine().trim());
         * 
         * List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$",
         * "").split(" ")) .map(Integer::parseInt) .collect(toList());
         */
        Result.plusMinus(null);

      //  bufferedReader.close();
    }
}
