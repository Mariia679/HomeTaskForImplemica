package com.implemica.task;

/**
 * Find the greatest common divisor between the four digits
 */
public class FindGreatestCommonDivisor {

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
        int minFirst;
        int minSecond;
        int divisor;
        if (one == Integer.MIN_VALUE || two == Integer.MIN_VALUE || three == Integer.MIN_VALUE || four == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("Illegal value should be > Integer.MIN_VALUE");
        }
        one = Math.abs(one);
        two = Math.abs(two);
        three = Math.abs(three);
        four = Math.abs(four);

        if (one < two) {
            minFirst = one;
        } else {
            minFirst = two;
        }
        if (three < four) {
            minSecond = three;
        } else {
            minSecond = four;
        }
        if (minFirst < minSecond) {
            divisor = minFirst;
        } else {
            divisor = minSecond;
        }
        while (divisor > 0) {
            if (one % divisor == 0 && two % divisor == 0 & three % divisor == 0 && four % divisor == 0) {
                return divisor;
            }
            divisor--;
        }
        return GREATEST_COMMON_DIVISOR_IF_ZERO_EXISTS_IN_EXPRESSION;
    }
}
