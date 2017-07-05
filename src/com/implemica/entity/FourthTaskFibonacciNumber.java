package com.implemica.entity;

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
            System.out.println("The number of fibonacci could not be negative");
            return null;
        }
        if (number > 194800) {
            System.out.println("The number of fibonacci could not be so big");
            return null;
        }
        if (number < 2) return BigInteger.valueOf(number);
        if (cache.containsKey(number)) return cache.get(number);
        BigInteger res;
        for (int i = 2; i <= number; i++) {
            res = solution(i - 1).add(solution(i - 2));
            cache.put(i, res);
        }
        return cache.get(number);
    }
}
