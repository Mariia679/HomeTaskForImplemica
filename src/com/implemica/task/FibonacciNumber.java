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
    private static Map<Integer, BigInteger> cache = new HashMap<>();

    static {
        cache.put(0, BigInteger.ZERO);
        cache.put(1, BigInteger.ONE);
    }

    /**
     * The max index of Fibonacci sequence that my computer can find.
     */
    private static final int MAX_FIBONACCI_INDEX = 194800;

    /**
     * Counts the Fibonacci number at its index.
     * Formula of finding Fibonacci sequence fibonacci(i-1)+fibonacci(i-2)
     *
     * @param number The required number of Fibonacci sequence.
     * @return Fibonacci number.
     * @throws IllegalArgumentException is not legal value {@code number < 0}
     *                                  or {@code number > 194800}.
     */
    public BigInteger getFibonacciNumber(int number) throws IllegalArgumentException {
        if (number < 0 || number > MAX_FIBONACCI_INDEX) {
            throw new IllegalArgumentException("Illegal value index = " + number + " should be >= 0 or <= " + MAX_FIBONACCI_INDEX);
        }
        BigInteger res = cache.get(number);
        if (res == null) {
            res = getFibonacciNumber(number - 1).add(getFibonacciNumber(number - 2));
            cache.put(number, res);
        }
        return res;
    }

}
