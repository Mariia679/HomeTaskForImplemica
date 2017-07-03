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

    private int divisor;

    public ThirdTaskFindGreatestCommonDivisor(int one, int two, int three, int four) {
        this.one = one;
        this.two = two;
        this.three = three;
        this.four = four;
    }

    @Override
    public void solution() {
        signChange();
        int minFirst;
        int minSecond;
        if (one < two) minFirst = one;
        else minFirst = two;
        if (three < four) minSecond = three;
        else minSecond = four;
        if (minFirst < minSecond) divisor = minFirst;
        else divisor = minSecond;
        for (; divisor > 0; divisor--) {
            if (one % divisor == 0 && two % divisor == 0 & three % divisor == 0 && four % divisor == 0) {
                System.out.println("The greatest common divisor of four number:\n" +"Is: " + divisor);
                break;
            }
        }
        if(divisor == 0){
            System.out.println("The greatest common divisor of four number:\n" + "Is: " + 1);
        }
    }

    private void signChange() {
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

    }

    public int getDivisor() {
        return divisor;
    }
}
