package com.java8.practice.fi;

import java.util.function.Consumer;

public class ConsumerTest {

    public static void main(String[] args) {
        Consumer<Integer> consumer = new Consumer<Integer>() {

            @Override
            public void accept(Integer t) {
                System.out.println(t);

            }
        };

        consumer.accept(123);
    }

}
