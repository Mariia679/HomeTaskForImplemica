package com.implemica;


import com.implemica.entity.*;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double number;
        one:
        while (true) {
            System.out.println("Enter the number");
            System.out.println("1 - Swap 2 variables without using the third");
            System.out.println("2 - Find the number of the porch and the floor, " +
                    "knowing the apartment number, " +
                    "the number of apartments on the floor and the number of floors in the house");
            System.out.println("3 - Find the greatest common divisor between the four digits");
            System.out.println("4 - Find the n-th number of Fibonacci");
            System.out.println("5 - Find the day of the week knowing that the year has started from a certain day of the week");
            System.out.println("6 - Exit this console application");
            switch (sc.next()) {
                case "1":
                    System.out.println("Enter first and second variable");
                    FirstTaskReplaceVariables task = new FirstTaskReplaceVariables();
                    task.solution((int) sc.nextDouble(), (int) sc.nextDouble());
                    break;
                case "2":
                    System.out.println("Enter number of floor in the house and number of apartaments on the floor and the number of flat");
                    SecondTaskFindFloorAndPorch taskSecond = new SecondTaskFindFloorAndPorch();
                    System.out.println(taskSecond.solution(sc.nextInt(), sc.nextInt(), sc.nextInt())+ " floor");
                    break;
                case "3":
                    System.out.println("Enter four number");
                    ThirdTaskFindGreatestCommonDivisor taskThird = new ThirdTaskFindGreatestCommonDivisor();
                    System.out.println(taskThird.solution(sc.nextInt(), sc.nextInt(), sc.nextInt(), sc.nextInt()));
                    break;
                case "4":
                    System.out.println("Enter the number of the Fibonacci number what you want to find");
                    number = sc.nextDouble();
                    FourthTaskFibonacciNumber taskFour = new FourthTaskFibonacciNumber();
                    System.out.println(taskFour.solution((int) number));
                    break;
                case "5":
                    System.out.println("Enter the the first day of the year and number of day and month you want to find");
                    System.out.println("0 - sunday  1 - monday  2 - tuesday  3 - wednesday  4 - thursday  5 - friday  6 - saturday");
                    System.out.println("1 - january  2 - february  3 - march  4 - april  5 - may\n" +
                            "6 - june  7 - july  8 - august  9 - september  10 - october  11 - november  12 - december");
                    FifthTaskFindTheDayOfTheWeek taskFifth = new FifthTaskFindTheDayOfTheWeek();
                    System.out.println(taskFifth.solution(sc.nextInt(), sc.nextInt(), sc.nextInt()));
                    break;
                default:
                    break one;
            }
        }
        System.out.println("The end of the application");

    }
}
