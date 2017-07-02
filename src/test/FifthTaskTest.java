package test;

import com.implemica.entity.FifthTaskFindTheDayOfTheWeek;
import org.junit.*;

import static org.junit.Assert.*;

public class FifthTaskTest {

    FifthTaskFindTheDayOfTheWeek fifthTask1;

    FifthTaskFindTheDayOfTheWeek fifthTask2;

    FifthTaskFindTheDayOfTheWeek fifthTask3;

    @Before
    public void setUp() throws Exception {
        fifthTask1 = new FifthTaskFindTheDayOfTheWeek(0,2,7);
        fifthTask2 = new FifthTaskFindTheDayOfTheWeek(0,0,0);
        fifthTask3 = new FifthTaskFindTheDayOfTheWeek(-2,-2,-2);
    }

    @Test
    public void solutionTest() throws Exception {
        fifthTask1.solution();
        assertEquals(0,fifthTask1.getDay());
        fifthTask2.solution();
        assertEquals(0,fifthTask2.getDay());
        fifthTask3.solution();
        assertEquals(0,fifthTask3.getDay());

    }
}
