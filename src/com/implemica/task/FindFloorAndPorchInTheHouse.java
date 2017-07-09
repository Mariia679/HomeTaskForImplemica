package com.implemica.task;

/**
 * Find the number of the porch and the floor,
 * knowing the apartment number, the number of apartments
 * on the floor and the number of floors in the house
 */
public class FindFloorAndPorchInTheHouse {

    /**
     * Floor of the desired apartment.
     */
    private int floorApartment;

    /**
     * Looking for a porch and a floor of an apartment which we search.
     *
     * @param floor                Number of floors in the house.
     * @param apartmentsOnTheFloor Number of apartments on the floor in this house.
     * @param apartment            Apartment that is looking for.
     * @return number of porch
     * @throws IllegalArgumentException is not legal value {@code floor <= 0}
     *                                  or {@code apartmentsOnTheFloor <= 0} or {@code apartment <= 0}
     *                                  or {@code floor == Integer.MAX_VALUE}
     *                                  or {@code apartmentsOnTheFloor == Integer.MAX_VALUE}.
     */
    public int getPorch(int floor, int apartmentsOnTheFloor, int apartment) throws IllegalArgumentException {
        if (floor <= 0 || apartmentsOnTheFloor <= 0 || apartment <= 0) {
            throw new IllegalArgumentException("Illegal value should be > 0");
        }
        if (floor == Integer.MAX_VALUE && apartmentsOnTheFloor == Integer.MAX_VALUE) {
            throw new IllegalArgumentException("Illegal value should be < Integer.MAX_VALUE");
        }
        int porch = 1;
        int numberOfFlatInThePorch = floor * apartmentsOnTheFloor;
        for (floorApartment = apartment; floorApartment > numberOfFlatInThePorch; floorApartment -= numberOfFlatInThePorch) {
            porch++;
        }
        floorApartment /= apartmentsOnTheFloor;
        if (apartment % apartmentsOnTheFloor != 0) {
            floorApartment++;
        }
        return porch;
    }

    /**
     * @return On which Floor is the apartment you are looking for.
     */
    public int getFloorApartment() {
        return floorApartment;
    }
}
