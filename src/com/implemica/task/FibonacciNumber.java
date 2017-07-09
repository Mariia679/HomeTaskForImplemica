package com.implemica.task;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

/**
 * Find the n-th number of Fibonacci.
 */
public class FibonacciNumber {

    /**
     * Preserves Fibonacci numbers in accordance with its index.
     * Also speeds up the program.
     */
    private Map<Integer, BigInteger> cache = new HashMap<>();

    private static final int MAX_FIBONACCI_INDEX = 194800;

    private static final int FIBONACCI_INDEX_TWO = 2;

    /**
     * Counts the Fibonacci number at its index.
     *
     * @param number The required Fibonacci number.
     * @return Fibonacci number.
     * @throws IllegalArgumentException is not legal value {@code number < 0}
     *                                  or {@code number > 194800}.
     */
    public BigInteger getFibonacciNumber(int number) throws IllegalArgumentException {
        if (number < 0 || number > MAX_FIBONACCI_INDEX) {
            throw new IllegalArgumentException("Illegal value: " + number + " should be >= 0 or <= 194800");
        }
        if (number < FIBONACCI_INDEX_TWO) {
            cache.putIfAbsent(number, BigInteger.valueOf(number));
            return cache.get(number);
        }

        BigInteger res = cache.get(number);
        if (res != null) {
            return res;
        }
        for (int i = FIBONACCI_INDEX_TWO; i <= number; i++) {
            res = getFibonacciNumber(i - 1).add(getFibonacciNumber(i - 2));
            cache.putIfAbsent(i, res);
        }
        return res;
    }
}
