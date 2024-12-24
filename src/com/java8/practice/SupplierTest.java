package com.java8.practice.fi;

import java.util.function.Supplier;

public class SupplierTest {

    public static void main(String[] args) {

        Supplier<Integer> supplier = new Supplier<Integer>() {

            @Override
            public Integer get() {
                return 1234;
            }
        };

        System.out.println(supplier.get());
        
        Supplier<Throwable> exception = new Supplier<Throwable>() {
            
            @Override
            public Throwable get() {
               
                return new Throwable("send the error!");
            }
        };
    }

}
