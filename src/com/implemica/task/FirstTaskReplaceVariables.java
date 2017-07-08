package com.implemica.task;

/**
 * Swap 2 variables without using the third
 */
public class FirstTaskReplaceVariables {

    public void solution(int first, int second) {
String a;        first = first ^ second;
        second = first ^ second;
        first = second ^ first;
        System.out.print("X = " + first + " ,Y = " + second);
    }
}
