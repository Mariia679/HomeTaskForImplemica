package com.implemica.entity;

import com.implemica.Task;

/**
 * Find the day of the week knowing that the year has started from a certain day of the week
 */
public class FifthTaskFindTheDayOfTheWeek implements Task {

    private int day;

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
    public void solution() throws IllegalArgumentException {
        try {
            if (firstDay < 0 || findDay <= 0 || numberOfMonth <= 0) {
                throw new IllegalArgumentException("You enter incorrect data");
            }
        } catch (IllegalArgumentException ex) {
            ex.printStackTrace();
            return;
        }
        switch (this.numberOfMonth) {
            case 1:
                try {
                    if (findDay > 31) {
                        throw new IllegalArgumentException("You enter incorrect day of january");
                    }
                } catch (IllegalArgumentException ex) {
                    ex.printStackTrace();
                    return;
                }
                day = findDay(firstDay);
                System.out.println("This day is " + day + " at the week");
                break;
            case 2:
                try {
                    if (findDay > 28) {
                        throw new IllegalArgumentException("You enter incorrect day of february");
                    }
                } catch (IllegalArgumentException ex) {
                    ex.printStackTrace();
                    return;
                }
                day = findDay(february);
                System.out.println("This day is " + day + " at the week");
                break;
            case 3:
                try {
                    if (findDay > 31) {
                        throw new IllegalArgumentException("You enter incorrect day of march");
                    }
                } catch (IllegalArgumentException ex) {
                    ex.printStackTrace();
                    return;
                }
                day = findDay(march);
                System.out.println("This day is " + day + " at the week");
                break;
            case 4:
                try {
                    if (findDay > 30) {
                        throw new IllegalArgumentException("You enter incorrect day of april");
                    }
                } catch (IllegalArgumentException ex) {
                    ex.printStackTrace();
                    return;
                }
                day = findDay(april);
                System.out.println("This day is " + day + " at the week");
                break;
            case 5:
                try {
                    if (findDay > 31) {
                        throw new IllegalArgumentException("You enter incorrect day of may");
                    }
                } catch (IllegalArgumentException ex) {
                    ex.printStackTrace();
                    return;
                }
                day = findDay(may);
                System.out.println("This day is " + day + " at the week");
                break;
            case 6:
                try {
                    if (findDay > 30) {
                        throw new IllegalArgumentException("You enter incorrect day of june");
                    }
                } catch (IllegalArgumentException ex) {
                    ex.printStackTrace();
                    return;
                }
                day = findDay(june);
                System.out.println("This day is " + day + " at the week");
                break;
            case 7:
                try {
                    if (findDay > 31) {
                        throw new IllegalArgumentException("You enter incorrect day of july");
                    }
                } catch (IllegalArgumentException ex) {
                    ex.printStackTrace();
                    return;
                }
                day = findDay(july);
                System.out.println("This day is " + day + " at the week");
                break;
            case 8:
                try {
                    if (findDay > 31) {
                        throw new IllegalArgumentException("You enter incorrect day of august");
                    }
                } catch (IllegalArgumentException ex) {
                    ex.printStackTrace();
                    return;
                }
                day = findDay(august);
                System.out.println("This day is " + day + " at the week");
                break;
            case 9:
                try {
                    if (findDay > 30) {
                        throw new IllegalArgumentException("You enter incorrect day of september");
                    }
                } catch (IllegalArgumentException ex) {
                    ex.printStackTrace();
                    return;
                }
                day = findDay(september);
                System.out.println("This day is " + day + " at the week");
                break;
            case 10:
                try {
                    if (findDay > 31) {
                        throw new IllegalArgumentException("You enter incorrect day of october");
                    }
                } catch (IllegalArgumentException ex) {
                    ex.printStackTrace();
                    return;
                }
                day = findDay(october);
                System.out.println("This day is " + day + " at the week");
                break;
            case 11:
                try {
                    if (findDay > 30) {
                        throw new IllegalArgumentException("You enter incorrect day of november");
                    }
                } catch (IllegalArgumentException ex) {
                    ex.printStackTrace();
                    return;
                }
                day = findDay(november);
                System.out.println("This day is " + day + " at the week");
                break;
            case 12:
                try {
                    if (findDay > 31) {
                        throw new IllegalArgumentException("You enter incorrect day of december");
                    }
                } catch (IllegalArgumentException ex) {
                    ex.printStackTrace();
                    return;
                }
                day = findDay(december);
                System.out.println("This day is " + day + " at the week");
                break;
            default:
                System.out.println("You enter incorrect number of month");
                break;
        }

    }

    public int findDay(int month) {
        if ((month + this.findDay) % 7 == 0) {
            return 6;
        }
        return (month + this.findDay) % 7 - 1;
    }

    public int getDay() {
        return day;
    }
}
