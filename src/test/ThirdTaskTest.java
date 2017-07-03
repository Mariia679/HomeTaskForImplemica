package test;

import com.implemica.entity.ThirdTaskFindGreatestCommonDivisor;
import org.junit.*;

import static org.junit.Assert.*;

public class ThirdTaskTest {

    ThirdTaskFindGreatestCommonDivisor thirdTask1;

    ThirdTaskFindGreatestCommonDivisor thirdTask2;

    ThirdTaskFindGreatestCommonDivisor thirdTask3;

    @Before
    public void setUp() throws Exception {
        thirdTask1 = new ThirdTaskFindGreatestCommonDivisor(2, 4, 6, 8);
        thirdTask2 = new ThirdTaskFindGreatestCommonDivisor(-2, -4, -6, -8);
        thirdTask3 = new ThirdTaskFindGreatestCommonDivisor(0, 0, 0, 0);
    }

    @Test
    public void solutionTest1() throws Exception {
        thirdTask1.solution();
        assertEquals(2, thirdTask1.getDivisor());
    }

    @Test
    public void solutionTest2() throws Exception {
        thirdTask2.solution();
        assertEquals(2, thirdTask2.getDivisor());
    }

    @Test
    public void solutionTest3() throws Exception {
        thirdTask3.solution();
        assertEquals(0, thirdTask3.getDivisor());
    }
}
