package test;

import com.implemica.task.FindFloorAndPorchInTheHouse;
import org.junit.*;

import static org.junit.Assert.*;

public class FindFloorAndPorchInTheHouseTest {

    FindFloorAndPorchInTheHouse task;

    @Before
    public void setUp() throws Exception {
        task = new FindFloorAndPorchInTheHouse();
    }

    @Test
    public void solutionTest1() throws Exception {
        //check variables @floor @apartmentOnTheFloor @apartment
        //check that in one porch only @floor*@apartmentOnTheFloor apartments
        //check that one floor contains @apartmentOnTheFloor
        methodTest(5, 5, 26, 2, 1);
        methodTest(5, 5, 25, 1, 5);
        methodTest(5, 5, 21, 1, 5);
        methodTest(5, 5, 11, 1, 3);
        methodTest(5, 5, 15, 1, 3);
        methodTest(5, 5, 16, 1, 4);
        methodTest(5, 5, 1, 1, 1);
        methodTest(5, 5, 5, 1, 1);
        methodTest(5, 5, 6, 1, 2);

        //check another porch for the same special cases
        methodTest(5, 5, 2501, 101, 1);
        methodTest(5, 5, 2500, 100, 5);
        methodTest(5, 5, 2496, 100, 5);
        methodTest(5, 5, 2486, 100, 3);
        methodTest(5, 5, 2490, 100, 3);
        methodTest(5, 5, 2491, 100, 4);
        methodTest(5, 5, 2476, 100, 1);
        methodTest(5, 5, 2480, 100, 1);
        methodTest(5, 5, 2481, 100, 2);

        //check one floor and one apartmentOnTheFloor the first apartment
        methodTest(1, 1, 1, 1, 1);
        methodTest(1, 1, 20, 20, 1);
        methodTest(1, 1, 40, 40, 1);
        methodTest(1, 1, 1001, 1001, 1);
        methodTest(1, 1, 99999999, 99999999, 1);

        //check one floor and other number of apartmentOnTheFloor
        methodTest(1, 20, 1, 1, 1);
        methodTest(1, 20, 21, 2, 1);
        methodTest(1, 20, 1000, 50, 1);
        methodTest(1, 20, 1001, 51, 1);
        methodTest(1, 20, 99_999_970, 4_999_999, 1);
        methodTest(1, 20, 100_000_000, 5_000_000, 1);

        //check some number of floor and one apartmentOnTheFloor
        methodTest(20, 1, 1, 1, 1);
        methodTest(20, 1, 20, 1, 20);
        methodTest(20, 1, 21, 2, 1);
        methodTest(20, 1, 1000, 50, 20);
        methodTest(20, 1, 1001, 51, 1);
        methodTest(20, 1, 99_999_961, 4_999_999, 1);
        methodTest(20, 1, 100_000_000, 5_000_000, 20);


        //test check middle integer
        methodTest(1023342343, 2, 1, 1, 1);
        methodTest(1023342343, 1, 1, 1, 1);
        methodTest(1, 1023342343, 1, 1, 1);
        methodTest(1, 1, 1023342343, 1023342343, 1);

        //the max of integer valuable value
        methodTest(Integer.MAX_VALUE, 1, 1, 1, 1);
        methodTest(1, Integer.MAX_VALUE, 1, 1, 1);
        methodTest(1, 1, Integer.MAX_VALUE, Integer.MAX_VALUE, 1);

        //not valid value
        //check that variables @floor @apartmentOnTheFloor @apartment can't be negative or zero
        methodTestIllegalArgument(0, 0, 0);
        methodTestIllegalArgument(-1, 1, 1);
        methodTestIllegalArgument(5, -1, 20);
        methodTestIllegalArgument(5, 2, -1);

        //the min and middle not valuable value
        methodTestIllegalArgument(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
        methodTestIllegalArgument(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        methodTestIllegalArgument(Integer.MIN_VALUE, 2, 2);
        methodTestIllegalArgument(2, Integer.MIN_VALUE, 2);
        methodTestIllegalArgument(2, Integer.MAX_VALUE, 2);
        methodTestIllegalArgument(Integer.MAX_VALUE, 2, 2);
        methodTestIllegalArgument(2, 2, Integer.MIN_VALUE);
        methodTestIllegalArgument(1023342343, 3, 1);
        methodTestIllegalArgument(-1023342343, -1023342343, -1023342343);
        methodTestIllegalArgument(1023342343, 1023342343, 1023342343);

    }

    private void methodTest(int floor, int apartmentsOnTheFloor, int apartment, int expectedPorch, int expectedFloor) {
        assertEquals(expectedPorch, task.getPorch(floor, apartmentsOnTheFloor, apartment));
        assertEquals(expectedFloor, task.getFloorApartment());
    }

    private void methodTestIllegalArgument(int floor, int apartmentsOnTheFloor, int apartment) {
//        assertThatThrownBy(() ->task.getPorch(floor, apartmentsOnTheFloor, apartment))
//                .isInstanceOf(IllegalArgumentException.class);
        try {
            task.getPorch(floor, apartmentsOnTheFloor, apartment);
            Assert.fail("Should throw an exception if one or more of given numbers are illegal");
        } catch (IllegalArgumentException ex) {
            //Should throw an exception if one or more of given numbers are illegal
        }
//        assertThatThrownBy(new ThrowableAssert.ThrowingCallable() {
//            @Override
//            public void call() throws Throwable {
//                task.getPorch(floor, apartmentsOnTheFloor, apartment);
//            }
//        }).isInstanceOf(IllegalArgumentException.class);
    }

}

