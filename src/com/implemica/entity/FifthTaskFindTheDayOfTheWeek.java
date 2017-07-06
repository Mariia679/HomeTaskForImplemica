package com.implemica.entity;

/**
 * Find the day of the week knowing that the year has started from a certain day of the week
 */
public class FifthTaskFindTheDayOfTheWeek {

    private int findDay;

    public int solution(int firstDay, int findDay, int numberOfMonth) {
        this.findDay = findDay;
        int february = (firstDay + 31) % 7;
        int march = (february + 28) % 7;
        int april = (march + 31) % 7;
        int may = (april + 30) % 7;
        int june = (may + 31) % 7;
        int july = (june + 30) % 7;
        int august = (july + 31) % 7;
        int september = (august + 31) % 7;
        int october = (september + 30) % 7;
        int november = (october + 31) % 7;
        int december = (november + 30) % 7;
        if (firstDay < 0 || findDay <= 0 || numberOfMonth <= 0) {
            return -1;
        }
        switch (numberOfMonth) {
            case 1:
                if (findDay > 31) {
                    return -1;
                }
                return findDay(firstDay);
            case 2:
                if (findDay > 28) {
                    return -1;
                }
                return findDay(february);
            case 3:
                if (findDay > 31) {
                    return -1;
                }
                return findDay(march);
            case 4:
                if (findDay > 30) {
                    return -1;
                }
                return findDay(april);
            case 5:
                if (findDay > 31) {
                    return -1;
                }
                return findDay(may);
            case 6:
                if (findDay > 30) {
                    return -1;
                }
                return findDay(june);
            case 7:
                if (findDay > 31) {
                    return -1;
                }
                return findDay(july);
            case 8:
                if (findDay > 31) {
                    return -1;
                }
                return findDay(august);
            case 9:
                if (findDay > 30) {
                    return -1;
                }
                return findDay(september);
            case 10:
                if (findDay > 31) {
                    return -1;
                }
                return findDay(october);
            case 11:
                if (findDay > 30) {
                    return -1;
                }
                return findDay(november);
            case 12:
                if (findDay > 31) {
                    return -1;
                }
                return findDay(december);
            default:
                return -1;
        }

    }

    public int findDay(int month) {
        if ((month + this.findDay) % 7 == 0) {
            return 6;
        }
        return (month + this.findDay) % 7 - 1;
    }

}
