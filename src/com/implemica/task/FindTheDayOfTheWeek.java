package com.implemica.task;

import java.time.DayOfWeek;
import java.time.Month;

/**
 * Find the day at the week
 * knowing that the year has started
 * from a certain day of the week.
 */
public class FindTheDayOfTheWeek {
    /**
     * The day we are looking for.
     */
    private int findDay;

    /**
     * Find the day at the week(in leap-year) knowing that the year has started
     * from a certain day of the week.
     *
     * @param firstDay      number of the day when new year is started
     * @param findDay       the day that we are looking for
     * @param numberOfMonth number of the month we are looking for
     *                      (JANUARY...DECEMBER - from 1 to 12)
     * @return Number of the day at the week
     * @throws IllegalArgumentException is not legal value {@code firstDay > 6} or {@code firstDay < 0}
     *                                  or {@code findDay <= 0} or {@code findDay > END_OF_THE_MONTH1}
     *                                  or {@code findDay > END_OF_THE_MONTH2} or {@code findDay > END_OF_THE_FEBRUARY}
     *                                  or {@code numberOfMonth <= 0} or {@code numberOfMonth > 12}
     */
    public int getFindDay(int firstDay, int findDay, int numberOfMonth) throws IllegalArgumentException {
        if (firstDay > DayOfWeek.SUNDAY.getValue()) {
            throw new IllegalArgumentException("Could not be more than number of day at the week");
        }
        if (firstDay <= 0 || findDay <= 0 || numberOfMonth <= 0) {
            throw new IllegalArgumentException("Illegal value, the variables @firstDay = " + firstDay +
                    " and @findDay = " + findDay +
                    " and @numberOfMonth " + numberOfMonth + " couldn't be <= 0");
        }

        this.findDay = findDay;
        int allDaysUntilDayLookingFor = 0;

        for (Month month : Month.values()) {
            int monthLength = month.minLength(); // the minimum length of this month in days, from 28 to 31
            if (month.getValue() != numberOfMonth) {
                allDaysUntilDayLookingFor += monthLength;
            } else {
                if (findDay > monthLength) {
                    throw new IllegalArgumentException("Illegal value the day is more than " + month.minLength());
                }
                return getDayOfWeek(allDaysUntilDayLookingFor + firstDay + findDay);
            }
        }
        throw new IllegalArgumentException("Illegal value of month couldn't be more than 12");
    }

    /**
     * Find the day of the week.
     *
     * @param amountOfDay The amount of the days up to the day we are looking for
     * @return The day of the week that we found
     */
    private int getDayOfWeek(int amountOfDay) {
        int sunday = DayOfWeek.SUNDAY.getValue();
        if (amountOfDay % sunday == 0) {
            return DayOfWeek.SATURDAY.getValue();
        }
        return amountOfDay % sunday - 1;
    }
}
