package com.implemica.task;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 * Find the n-th number of Fibonacci
 */
public class FourthTaskFibonacciNumber {

    private Map<Integer, BigInteger> cache = new HashMap<>();

    public BigInteger solution(int number) {
        if (number < 0) {
            throw new IllegalArgumentException();
        }
        if (number > 194800) {
            throw new IllegalArgumentException();
        }
        if (number < 2) {
            cache.put(number, BigInteger.valueOf(number));
            return BigInteger.valueOf(number);
        }
        if (cache.containsKey(number)) return cache.get(number);
        BigInteger res;
        for (int i = 2; i <= number; i++) {
            res = solution(i - 1).add(solution(i - 2));
            cache.put(i, res);
        }
        return cache.get(number);
    }
}
