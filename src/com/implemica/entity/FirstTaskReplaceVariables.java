package com.implemica.entity;

import com.implemica.Task;

/**
 * Swap 2 variables without using the third
 */
public class FirstTaskReplaceVariables implements Task {

    private int first;

    private int second;

    public FirstTaskReplaceVariables(int first, int second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public void solution() {
        System.out.println("X = " + first + " ,Y = " + second);
        first = first ^ second;
        second = first ^ second;
        first = second ^ first;
        System.out.println("X = " + getFirst() + " ,Y = " + getSecond());
    }

    public int getFirst() {
        return first;
    }

    public int getSecond() {
        return second;
    }
}
