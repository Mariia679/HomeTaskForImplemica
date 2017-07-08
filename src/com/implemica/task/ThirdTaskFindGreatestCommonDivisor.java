package com.implemica.task;


/**
 * Find the greatest common divisor between the four digits
 */
public class ThirdTaskFindGreatestCommonDivisor {

    public long solution(int one, int two, int three, int four) {
        long minFirst;
        long minSecond;
        long divisor;
        if (one == Integer.MIN_VALUE || two == Integer.MIN_VALUE || three == Integer.MIN_VALUE || four == Integer.MIN_VALUE) {
            throw new IllegalArgumentException();
        }
        if (one < 0) {
            one *= -1;
        }
        if (two < 0) {
            two *= -1;
        }
        if (three < 0) {
            three *= -1;
        }
        if (four < 0) {
            four *= -1;
        }
        if (one < two) minFirst = one;
        else minFirst = two;
        if (three < four) minSecond = three;
        else minSecond = four;
        if (minFirst < minSecond) divisor = minFirst;
        else divisor = minSecond;
        for (; divisor > 0; divisor--) {
            if (one % divisor == 0 && two % divisor == 0 & three % divisor == 0 && four % divisor == 0) {
                return divisor;
            }
        }
        return 1;
    }
}
