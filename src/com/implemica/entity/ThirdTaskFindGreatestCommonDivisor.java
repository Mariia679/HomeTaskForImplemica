package com.implemica.entity;

import com.implemica.Task;

/**
 * Find the greatest common divisor between the four digits
 */
public class ThirdTaskFindGreatestCommonDivisor implements Task {

    private int one;

    private int two;

    private int three;

    private int four;

    public ThirdTaskFindGreatestCommonDivisor(int one, int two, int three, int four) {
        this.one = one;
        this.two = two;
        this.three = three;
        this.four = four;
    }

    @Override
    public void solution() {
        int minFirst;
        int minSecond;
        int min;
        if (one < two) minFirst = one;
        else minFirst = two;
        if (three < four) minSecond = three;
        else minSecond = four;
        if (minFirst < minSecond) min = minFirst;
        else min = minSecond;
        for (int i = min; i > 0; i--) {
            if (one % i == 0 && two % i == 0 & three % i == 0 && four % i == 0) {
                System.out.println("The greatest common divisor of four number:\n" +
                        "First = " + one + "\nSecond = " + two + "\nThree = " + three + "\nFour = " + four + "\nIs: " + i);
                break;
            }
        }
    }
}
