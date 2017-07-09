package com.implemica.task;

/**
 * Swap 2 variables without using the third
 */
public class ReplaceVariables {

    /**
     * This method swaps the values of variables
     *
     * @param first  Variable in which the value will change
     * @param second Variable in which the value will change
     */
    public void swappingVariables(int first, int second) {
        first = first ^ second;
        second = first ^ second;
        first = second ^ first;

        System.out.print("X = " + first + " ,Y = " + second);
    }
}
