package com.implemica.task;

import static java.lang.Math.*;

/**
 * Find the greatest common divisor between the four digits
 */
public class FindGreatestCommonDivisor {

    /**
     * The greatest common divisor if zero exists in transmitted values.
     */
    private static final int GREATEST_COMMON_DIVISOR_IF_ZERO_EXISTS_IN_EXPRESSION = 1;

    /**
     * Find the greatest common divisor of four numbers
     *
     * @param one   first of four numbers
     * @param two   second of four numbers
     * @param three third of four numbers
     * @param four  fourth of four numbers
     * @return the greatest common divisor of four numbers
     * @throws IllegalArgumentException is not legal value {@code one == Integer.MIN_VALUE}
     *                                  or {@code two == Integer.MIN_VALUE}
     *                                  or {@code three == Integer.MIN_VALUE}
     *                                  or {@code four == Integer.MIN_VALUE}
     */
    public int getGreatestDivisor(int one, int two, int three, int four) throws IllegalArgumentException {
        if (one == Integer.MIN_VALUE || two == Integer.MIN_VALUE || three == Integer.MIN_VALUE || four == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("@one = " + one +
                    " @two = " + two + " @three = " + three +
                    " @four = " + four + " should be > " + Integer.MIN_VALUE);
        }
        one = abs(one);
        two = abs(two);
        three = abs(three);
        four = abs(four);

        int minFirst = min(one, two);
        int minSecond = min(three, four);
        minFirst = min(minFirst, minSecond);

        while (minFirst > 0) {
            if (floorMod(one, minFirst) == 0
                    && floorMod(two, minFirst) == 0
                    && floorMod(three, minFirst) == 0
                    && floorMod(four, minFirst) == 0) {
                return minFirst;
            }
            minFirst--;
        }
        return GREATEST_COMMON_DIVISOR_IF_ZERO_EXISTS_IN_EXPRESSION;
    }
}
