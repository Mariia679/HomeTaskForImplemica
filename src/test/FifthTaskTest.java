package test;

import com.implemica.entity.FifthTaskFindTheDayOfTheWeek;
import org.junit.*;

import static org.junit.Assert.*;

public class FifthTaskTest {

    FifthTaskFindTheDayOfTheWeek fifthTask1;

    @Before
    public void setUp() throws Exception {
        fifthTask1 = new FifthTaskFindTheDayOfTheWeek();
    }

    @After
    public void tearDown() throws Exception {
        fifthTask1 = null;
    }

    @Test
    public void solutionTest1() throws Exception {
        methodNotValid(0, 0, 0, -1);
        methodNotValid(0, 0, 1, -1);
        methodNotValid(0, -1, 1, -1);
        methodNotValid(0, 1, -1, -1);
        methodNotValid(-1, 1, 1, -1);

        methodNotValid(0, 32, 1, -1);
        methodNotValid(0, 29, 2, -1);
        methodNotValid(0, 32, 3, -1);
        methodNotValid(0, 31, 4, -1);

        methodNotValid(0, 32, 5, -1);
        methodNotValid(0, 31, 6, -1);
        methodNotValid(0, 32, 7, -1);
        methodNotValid(0, 32, 8, -1);

        methodNotValid(0, 31, 9, -1);
        methodNotValid(0, 32, 10, -1);
        methodNotValid(0, 31, 11, -1);
        methodNotValid(0, 32, 12, -1);
        methodNotValid(0, 2, 13, -1);

        methodNotValid(0, 15, 1, 0);
        methodNotValid(0, 15, 2, 3);
        methodNotValid(0, 15, 3, 3);
        methodNotValid(0, 15, 4, 6);
        methodNotValid(0, 15, 5, 1);
        methodNotValid(0, 15, 6, 4);
        methodNotValid(0, 15, 7, 6);
        methodNotValid(0, 15, 8, 2);
        methodNotValid(0, 15, 9, 5);
        methodNotValid(0, 15, 10, 0);
        methodNotValid(0, 15, 11, 3);
        methodNotValid(0, 15, 12, 5);

        methodNotValid(0, 1, 1, 0);
        methodNotValid(0, 1, 2, 3);
        methodNotValid(0, 1, 3, 3);
        methodNotValid(0, 1, 4, 6);
        methodNotValid(0, 1, 5, 1);
        methodNotValid(0, 1, 6, 4);
        methodNotValid(0, 1, 7, 6);
        methodNotValid(0, 1, 8, 2);
        methodNotValid(0, 1, 9, 5);
        methodNotValid(0, 1, 10, 0);
        methodNotValid(0, 1, 11, 3);
        methodNotValid(0, 1, 12, 5);
    }

    private void methodNotValid(int firstDay, int findDay, int numberOfMonth, int expected) {
        assertEquals(expected, fifthTask1.solution(firstDay, findDay, numberOfMonth));
    }

}
