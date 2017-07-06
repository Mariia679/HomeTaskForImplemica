package test;

import com.implemica.entity.SecondTaskFindFloorAndPorch;
import org.junit.*;

import static org.junit.Assert.*;

public class SecondTaskTest {

    SecondTaskFindFloorAndPorch secondTask1;

    @Before
    public void setUp() throws Exception {
        secondTask1 = new SecondTaskFindFloorAndPorch();
    }

    @Test
    public void solutionTest1() throws Exception {
        methodTest(5, 5, 25,1 + " porch " + 5 + " floor");
        methodTest(5, 4, 25,2 + " porch " + 2 + " floor");
        methodTest(5, 2, 25,3 + " porch " + 3 + " floor");
        methodTest(9, 4, 36,1 + " porch " + 9 + " floor");
        methodTest(9, 4, 37,2 + " porch " + 1 + " floor");
        methodTest(1023342343, 1023342343, 1023342343,1 + " porch " + 1 + " floor");
        methodTest(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE,Integer.MAX_VALUE + " porch " + 1 + " floor");
        methodTest(0, Integer.MAX_VALUE, 0,"-1");
        methodTest(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE,"-1");
        methodTest(-1023342343, -1023342343, -1023342343,"-1");
        methodTest(0, 0, 0,"-1");
        methodTest(-1, 1, 1,"-1");
        methodTest(5, -1, 20,"-1");
        methodTest(5, 2, -1,"-1");
        methodTest(-1, -1, 1,"-1");
        methodTest(1, -1, -1,"-1");
        methodTest(-1, 1, -1,"-1");
    }

    private void methodTest(int floor, int apartmentsOnTheFloor, int apartment,String expected) {
        assertEquals(expected, secondTask1.solution(floor, apartmentsOnTheFloor, apartment));
    }
}

