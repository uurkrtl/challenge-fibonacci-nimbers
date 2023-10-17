package org.eagle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fibonacci {
    public static int fibonacci(int number){
        int fibonocciSum = 0;
        if (number == 0 || number == 1){
            fibonocciSum = number;
        } else{
            List<Integer>consequence = new ArrayList<>(Arrays.asList(0,1));

            for (int i = 2; i<=number; i++){
                fibonocciSum = consequence.stream().mapToInt(Integer::intValue).sum();
                consequence.remove(0);
                consequence.add(fibonocciSum);
            }
        }
        return fibonocciSum;
    }
}