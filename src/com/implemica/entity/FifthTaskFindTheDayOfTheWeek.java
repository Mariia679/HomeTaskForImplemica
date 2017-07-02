package com.implemica.entity;

import com.implemica.Task;

/**
 * Find the day of the week knowing that the year has started from a certain day of the week
 */
public class FifthTaskFindTheDayOfTheWeek implements Task {

    private int findDay;

    private int numberOfMonth;

    private int firstDay;

    private int february;

    private int march;

    private int april;

    private int may;

    private int june;

    private int july;

    private int august;

    private int september;

    private int october;

    private int november;

    private int december;


    public FifthTaskFindTheDayOfTheWeek(int firstDay, int findDay, int numberOfMonth) {
        this.firstDay = firstDay;
        this.findDay = findDay;
        this.numberOfMonth = numberOfMonth;
        february = (this.firstDay + 31) % 7;
        march = (february + 28) % 7;
        april = (march + 31) % 7;
        may = (april + 30) % 7;
        june = (may + 31) % 7;
        july = (june + 30) % 7;
        august = (july + 31) % 7;
        september = (august + 31) % 7;
        october = (september + 30) % 7;
        november = (october + 31) % 7;
        december = (november + 30) % 7;
    }

    @Override
    public void solution() {
        if (firstDay < 0 || findDay <= 0 || numberOfMonth <= 0) {
            System.out.println("You enter incorrect data");
            return;
        }
        switch (this.numberOfMonth) {
            case 1:
                System.out.println("This day is " + findDay(firstDay) + " at the week");
                break;
            case 2:
                System.out.println("This day is " + findDay(february) + " at the week");
                break;
            case 3:
                System.out.println("This day is " + findDay(march) + " at the week");
                break;
            case 4:
                System.out.println("This day is " + findDay(april) + " at the week");
                break;
            case 5:
                System.out.println("This day is " + findDay(may) + " at the week");
                break;
            case 6:
                System.out.println("This day is " + findDay(june) + " at the week");
                break;
            case 7:
                System.out.println("This day is " + findDay(july) + " at the week");
                break;
            case 8:
                System.out.println("This day is " + findDay(august) + " at the week");
                break;
            case 9:
                System.out.println("This day is " + findDay(september) + " at the week");
                break;
            case 10:
                System.out.println("This day is " + findDay(october) + " at the week");
                break;
            case 11:
                System.out.println("This day is " + findDay(november) + " at the week");
                break;
            case 12:
                System.out.println("This day is " + findDay(december) + " at the week");
                break;
            default:
                break;
        }
    }

    private int findDay(int month) {
        if ((month + this.findDay) % 7 == 0) {
            return 6;
        }
        return (month + this.findDay) % 7 - 1;
    }

}
