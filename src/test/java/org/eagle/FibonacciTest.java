package org.eagle;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciTest {
    @Test
    public void givenIntegerMoreThan1_whenFibonacciFind_thenReturnFibonacci(){
        int number = 12;
        Fibonacci fibonacci = new Fibonacci();

        int expected = 144;
        int actual = Fibonacci.fibonacci(12);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void given1_whenFibonacciFind_thenReturn1(){
        int number = 1;
        Fibonacci fibonacci = new Fibonacci();

        int expected = 144;
        int actual = Fibonacci.fibonacci(12);

        Assertions.assertEquals(expected,actual);
    }

    @Test
    public void given0_whenFibonacciFind_thenReturn0(){
        int number = 0;
        Fibonacci fibonacci = new Fibonacci();

        int expected = 144;
        int actual = Fibonacci.fibonacci(12);

        Assertions.assertEquals(expected,actual);
    }
}
