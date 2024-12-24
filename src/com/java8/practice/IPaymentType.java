package com.java8.practice.fi;


/**
 * Marker interface should not have methods (abstract).
 * Functional Interface should NOT extend other functional interface or other interfaces (normal).
 * A Functional interface can have n number of default or static methods.
 * A functional interface can extend marker interfaces.
 * 
 */
@FunctionalInterface
public interface IPaymentType  extends DummyInft, FunctionalIntf
{

    public String paymentType();

    default void m1() {

    }

    default void m2() {

    }

    default void m3() {

    }

    static void selectPaymentType() {

    }

    static void selectPaymentType1() {

    }
}


interface DummyInft{
    
}

@FunctionalInterface
interface FunctionalIntf{
    
    String performFunction();
}