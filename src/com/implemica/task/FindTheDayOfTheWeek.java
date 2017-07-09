package com.implemica.task;

/**
 * Find the day at the week
 * knowing that the year has started
 * from a certain day of the week.
 */
public class FindTheDayOfTheWeek {
    /**
     * The day we are looking for.
     */
    private static int findDay;
    /**
     * The first day of year
     */
    private static int firstDay;

    private static final int END_OF_THE_MONTH31 = 31;

    private static final int END_OF_THE_MONTH30 = 30;

    private static final int END_OF_THE_FEBRUARY = 28;

    private static final int NUMBER_OF_DAYS_PER_WEEK = 7;

    private static final int SATURDAY = 6;

    private static int february = (firstDay + END_OF_THE_MONTH31) % NUMBER_OF_DAYS_PER_WEEK;
    private static int march = (february + END_OF_THE_FEBRUARY) % NUMBER_OF_DAYS_PER_WEEK;
    private static int april = (march + END_OF_THE_MONTH31) % NUMBER_OF_DAYS_PER_WEEK;
    private static int may = (april + END_OF_THE_MONTH30) % NUMBER_OF_DAYS_PER_WEEK;
    private static int june = (may + END_OF_THE_MONTH31) % NUMBER_OF_DAYS_PER_WEEK;
    private static int july = (june + END_OF_THE_MONTH30) % NUMBER_OF_DAYS_PER_WEEK;
    private static int august = (july + END_OF_THE_MONTH31) % NUMBER_OF_DAYS_PER_WEEK;
    private static int september = (august + END_OF_THE_MONTH31) % NUMBER_OF_DAYS_PER_WEEK;
    private static int october = (september + END_OF_THE_MONTH30) % NUMBER_OF_DAYS_PER_WEEK;
    private static int november = (october + END_OF_THE_MONTH31) % NUMBER_OF_DAYS_PER_WEEK;
    private static int december = (november + END_OF_THE_MONTH30) % NUMBER_OF_DAYS_PER_WEEK;

    /**
     * The enumeration of months
     * with the beginning of each month
     * and the number of days in a month
     */
    enum Month {
        JANUARY(END_OF_THE_MONTH31, firstDay), FEBRUARY(END_OF_THE_FEBRUARY, february),
        MARCH(END_OF_THE_MONTH31, march), APRIL(END_OF_THE_MONTH30, april),
        MAY(END_OF_THE_MONTH31, may), JUNE(END_OF_THE_MONTH30, june), JULY(END_OF_THE_MONTH31, july),
        AUGUST(END_OF_THE_MONTH31, august), SEPTEMBER(END_OF_THE_MONTH30, september), OCTOBER(END_OF_THE_MONTH31, october),
        NOVEMBER(END_OF_THE_MONTH30, november), DECEMBER(END_OF_THE_MONTH31, december);

        int endOfMonth;
        int startMonth;

        Month(int endOfMonth, int startMonth) {
            this.endOfMonth = endOfMonth;
            this.startMonth = startMonth;
        }
    }

    /**
     * Find the day at the week knowing that the year has started
     * from a certain day of the week
     *
     * @param firstDay      number of the day when new year is started
     * @param findDay       number of the day that we are looking for
     * @param numberOfMonth and number of the month we are looking for
     * @return Number of the day at the week
     * @throws IllegalArgumentException is not legal value {@code firstDay > 6} or {@code firstDay < 0}
     *                                  or {@code findDay <= 0} or {@code findDay > END_OF_THE_MONTH1}
     *                                  or {@code findDay > END_OF_THE_MONTH2} or {@code findDay > END_OF_THE_FEBRUARY}
     *                                  or {@code numberOfMonth <= 0} or {@code numberOfMonth > 12}
     */
    public int getFindDay(int firstDay, int findDay, int numberOfMonth) throws IllegalArgumentException {
        if (firstDay > NUMBER_OF_DAYS_PER_WEEK) {
            throw new IllegalArgumentException("The year could not started on day more than number of the day at the week 7");
        }
        if (firstDay <= 0 || findDay <= 0 || numberOfMonth < 0) {
            throw new IllegalArgumentException("Illegal value, the variables @firstDay and @findDay couldn't be <= 0, " +
                    "and @numberOfMonth < 0");
        }
        this.firstDay = firstDay;
        this.findDay = findDay;
        int day;
        for (Month month : Month.values()) {
            if (month.ordinal() == numberOfMonth) {
                if (findDay > month.endOfMonth) {
                    throw new IllegalArgumentException();
                }
                if (firstDay < NUMBER_OF_DAYS_PER_WEEK) {
                    day = findDay(month.startMonth) + firstDay;
                    if (day >= NUMBER_OF_DAYS_PER_WEEK) {
                        return day - NUMBER_OF_DAYS_PER_WEEK;
                    }
                    return day;
                }
                return findDay(month.startMonth);
            }
        }
        throw new IllegalArgumentException("Illegal value of month couldn't be more than 12");
    }

    private int findDay(int month) {
        if ((month + findDay) % NUMBER_OF_DAYS_PER_WEEK == 0) {
            return SATURDAY;
        }
        return (month + findDay) % NUMBER_OF_DAYS_PER_WEEK - 1;
    }

}
