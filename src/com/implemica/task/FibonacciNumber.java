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

    /**
     * The max index of Fibonacci sequence that my computer can find.
     */
    private static final int MAX_FIBONACCI_INDEX = 194800;

    /**
     * The index of Fibonacci sequence that we can start count.
     * Before and include this index (0,1,1...)
     */
    private static final int FIBONACCI_INDEX_TWO = 2;

    /**
     * Counts the Fibonacci number at its index.
     * Formula of finding Fibonacci sequence fibonacci(i-1)+fibonacci(i-2)
     *
     * @param number The required Fibonacci number.
     * @return Fibonacci number.
     * @throws IllegalArgumentException is not legal value {@code number < 0}
     *                                  or {@code number > 194800}.
     */
    public BigInteger getFibonacciNumber(int number) throws IllegalArgumentException {
        if (number < 0 || number > MAX_FIBONACCI_INDEX) {
            throw new IllegalArgumentException("Illegal value index = " + number + " should be >= 0 or <= " + MAX_FIBONACCI_INDEX);
        }
        //return the current (existing) value associated with the specified key
        return cache.computeIfAbsent(number, (k) -> {
            if (k < FIBONACCI_INDEX_TWO) {
                return BigInteger.valueOf(k);
            }
            return getFibonacciNumber(k - 1).add(getFibonacciNumber(k - 2));
        });
    }
}
