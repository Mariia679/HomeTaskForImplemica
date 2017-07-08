package com.implemica.task;

/**
 * Find the number of the porch and the floor,
 * knowing the apartment number, the number of apartments
 * on the floor and the number of floors in the house
 */
public class SecondTaskFindFloorAndPorch {

    private int floorApartment;

    private int numberOfFlatInThePorch;

    public int solution(int floor, int apartmentsOnTheFloor, int apartment) {
        if (floor <= 0 || apartmentsOnTheFloor <= 0 || apartment <= 0) {
            floorApartment = 0;
            throw new IllegalArgumentException();
        }
        int porch = 0;
        numberOfFlatInThePorch = floor * apartmentsOnTheFloor;

        for (floorApartment = apartment; floorApartment > 0; floorApartment -= numberOfFlatInThePorch) {
            porch++;
        }

        floorApartment += numberOfFlatInThePorch;
        if (floorApartment > 0 || apartmentsOnTheFloor > 0) {
            if (floorApartment % apartmentsOnTheFloor != 0) {
                floorApartment /= apartmentsOnTheFloor;
                floorApartment++;
            } else {
                floorApartment /= apartmentsOnTheFloor;
            }
        }
        return porch ;
    }

    public int getFloorApartment() {
        return floorApartment;
    }
}
