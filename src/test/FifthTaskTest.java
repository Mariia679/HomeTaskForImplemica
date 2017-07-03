package test;

import com.implemica.entity.FifthTaskFindTheDayOfTheWeek;
import org.junit.*;

import static org.junit.Assert.*;

public class FifthTaskTest {

    FifthTaskFindTheDayOfTheWeek fifthTask1;

    FifthTaskFindTheDayOfTheWeek fifthTask3;

    @Before
    public void setUp() throws Exception {
        fifthTask1 = new FifthTaskFindTheDayOfTheWeek(0,2,7);
        fifthTask3 = new FifthTaskFindTheDayOfTheWeek(-2,0,-2);
    }

    @After
    public void tearDown() throws Exception {
        fifthTask1 = null;
        fifthTask3 = null;
    }

    @Test
    public void solutionTest1() throws Exception {
        fifthTask1.solution();
        assertEquals(0,fifthTask1.getDay());
    }

    @Test(expected = IllegalArgumentException.class)
    public void solutionTest3() throws Exception {
        fifthTask3.solution();
    }
}
