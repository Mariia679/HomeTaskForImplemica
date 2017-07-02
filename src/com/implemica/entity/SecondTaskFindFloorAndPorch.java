package com.implemica.entity;

import com.implemica.Task;

/**
 * Find the number of the porch and the floor,
 * knowing the apartment number, the number of apartments
 * on the floor and the number of floors in the house
 */
public class SecondTaskFindFloorAndPorch implements Task {

    private int floor;

    private int apartmentsOnTheFloor;

    private int apartment;

    public SecondTaskFindFloorAndPorch(int floor, int apartmentsOnTheFloor, int apartment) {
        this.floor = floor;
        this.apartmentsOnTheFloor = apartmentsOnTheFloor;
        this.apartment = apartment;
    }

    @Override
    public void solution() {
        int numberOfFlatInThePorch = floor * apartmentsOnTheFloor;
        int porch = 0;
        int floorApartment;
        if (floor < 0 || apartmentsOnTheFloor < 0 || apartment < 0) {
            System.out.println("The number of floor in the house or number of apartaments on the floor or the number of flat is incorrect");
            return;
        }
        for (floorApartment = apartment; floorApartment > 0; floorApartment -= numberOfFlatInThePorch) {
            porch++;
        }
        floorApartment += numberOfFlatInThePorch;
        if (floorApartment % apartmentsOnTheFloor != 0) {
            floorApartment /= apartmentsOnTheFloor;
            floorApartment++;
        } else {
            floorApartment /= apartmentsOnTheFloor;
        }
        System.out.println("The porch of " + apartment + " flat is " + porch + " porch and floor is " + floorApartment);
    }
}
