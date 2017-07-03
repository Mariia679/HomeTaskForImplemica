package test;

import com.implemica.entity.FifthTaskFindTheDayOfTheWeek;
import org.junit.*;

import static org.junit.Assert.*;

public class FifthTaskTest {

    FifthTaskFindTheDayOfTheWeek fifthTask1;

    FifthTaskFindTheDayOfTheWeek fifthTask2;

    FifthTaskFindTheDayOfTheWeek fifthTask3;

    FifthTaskFindTheDayOfTheWeek fifthTask4;

    @Before
    public void setUp() throws Exception {
        fifthTask1 = new FifthTaskFindTheDayOfTheWeek(0,2,7);
        fifthTask2 = new FifthTaskFindTheDayOfTheWeek(0,32,12);
        fifthTask3 = new FifthTaskFindTheDayOfTheWeek(-2,0,-2);
        fifthTask4 = new FifthTaskFindTheDayOfTheWeek(0,2,13);
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

    @Test
    public void solutionTest2() throws Exception {
        fifthTask2.solution();
    }

    @Test
    public void solutionTest3() throws Exception {
        fifthTask3.solution();
    }

    @Test
    public void solutionTest4() throws Exception {
        fifthTask4.solution();
    }
}
