package com.implemica.entity;

import com.implemica.Task;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 * Find the n-th number of Fibonacci
 */
public class FourthTaskFibonacciNumber implements Task {

    private Map<Integer, BigInteger> cache = new HashMap<>();

    private int number;

    public FourthTaskFibonacciNumber(int number) {
        this.number = number;
    }

    @Override
    public void solution() {
        long startTime = System.currentTimeMillis();
        System.out.println(fibonacci(this.number));
        long finishTime = System.currentTimeMillis();
        System.out.println(finishTime - startTime + " ms");
    }

    private BigInteger fibonacci(int num) {
        if (num < 2) return BigInteger.valueOf(num);
        if (cache.containsKey(num)) return cache.get(num);
        BigInteger res;
        for (int i = 2; i <= num; i++) {
            res = fibonacci(i - 1).add(fibonacci(i - 2));
            cache.put(i, res);
        }
        return cache.get(num);

    }

}
