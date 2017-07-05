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
        assertEquals(0, fifthTask1.solution(0, 2, 7));
        assertEquals(-1, fifthTask1.solution(0, 0, 0));
        assertEquals(0, fifthTask1.solution(0, 15, 1));
        assertEquals(3, fifthTask1.solution(0, 15, 2));
        assertEquals(3, fifthTask1.solution(0, 15, 3));
        assertEquals(6, fifthTask1.solution(0, 15, 4));
        assertEquals(1, fifthTask1.solution(0, 15, 5));
        assertEquals(4, fifthTask1.solution(0, 15, 6));
        assertEquals(6, fifthTask1.solution(0, 15, 7));
        assertEquals(2, fifthTask1.solution(0, 15, 8));
        assertEquals(5, fifthTask1.solution(0, 15, 9));
        assertEquals(0, fifthTask1.solution(0, 15, 10));
        assertEquals(3, fifthTask1.solution(0, 15, 11));
        assertEquals(5, fifthTask1.solution(0, 15, 12));
        assertEquals(0, fifthTask1.solution(0, 1, 1));
        assertEquals(3, fifthTask1.solution(0, 1, 2));
        assertEquals(3, fifthTask1.solution(0, 1, 3));
        assertEquals(6, fifthTask1.solution(0, 1, 4));
        assertEquals(1, fifthTask1.solution(0, 1, 5));
        assertEquals(4, fifthTask1.solution(0, 1, 6));
        assertEquals(6, fifthTask1.solution(0, 1, 7));
        assertEquals(2, fifthTask1.solution(0, 1, 8));
        assertEquals(5, fifthTask1.solution(0, 1, 9));
        assertEquals(0, fifthTask1.solution(0, 1, 10));
        assertEquals(3, fifthTask1.solution(0, 1, 11));
        assertEquals(5, fifthTask1.solution(0, 1, 12));
        assertEquals(-1, fifthTask1.solution(0, 32, 12));
        assertEquals(-1, fifthTask1.solution(0, 31, 11));
        assertEquals(-1, fifthTask1.solution(0, 32, 10));
        assertEquals(-1, fifthTask1.solution(0, 31, 9));
        assertEquals(-1, fifthTask1.solution(0, 32, 8));
        assertEquals(-1, fifthTask1.solution(0, 32, 7));
        assertEquals(-1, fifthTask1.solution(0, 31, 6));
        assertEquals(-1, fifthTask1.solution(0, 32, 5));
        assertEquals(-1, fifthTask1.solution(0, 31, 4));
        assertEquals(-1, fifthTask1.solution(0, 32, 3));
        assertEquals(-1, fifthTask1.solution(0, 29, 2));
        assertEquals(-1, fifthTask1.solution(0, 32, 1));
        assertEquals(-1, fifthTask1.solution(-1, 1, 1));
        assertEquals(-1, fifthTask1.solution(0, 2, 13));
        assertEquals(-1, fifthTask1.solution(0, 1, -1));
        assertEquals(-1, fifthTask1.solution(0, -1, 1));
        assertEquals(-1, fifthTask1.solution(0, 0, 1));
    }
//
//    private int method(int firstDay,int findDay,int numberOfMonth){
//        assertEquals(0, fifthTask1.solution(firstDay,findDay,numberOfMonth));
//    }

}
