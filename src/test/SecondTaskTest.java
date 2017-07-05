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
        assertEquals(2 + " porch " + 1 + " floor", secondTask1.solution(9, 4, 37));
        assertEquals(Integer.MAX_VALUE + " porch " + 1 + " floor", secondTask1.solution(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE));
        assertEquals("-1", secondTask1.solution(0, Integer.MAX_VALUE, 0));
        assertEquals("-1", secondTask1.solution(0, 0, 0));
        assertEquals(1 + " porch " + 1 + " floor", secondTask1.solution(1023342343, 1023342343, 1023342343));
        assertEquals(1 + " porch " + 9 + " floor", secondTask1.solution(9, 4, 36));
        assertEquals(3 + " porch " + 3 + " floor", secondTask1.solution(5, 2, 25));
        assertEquals(2 + " porch " + 2 + " floor", secondTask1.solution(5, 4, 25));
        assertEquals(1 + " porch " + 5 + " floor", secondTask1.solution(5, 5, 25));
        assertEquals("-1", secondTask1.solution(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE));
        assertEquals("-1", secondTask1.solution(-1023342343, -1023342343, -1023342343));
        assertEquals("-1", secondTask1.solution(-1, 1, 1));
        assertEquals("-1", secondTask1.solution(5, -1, 20));
        assertEquals("-1", secondTask1.solution(5, 2, -1));
        assertEquals("-1", secondTask1.solution(-1, -1, 1));
        assertEquals("-1", secondTask1.solution(1, -1, -1));
        assertEquals("-1", secondTask1.solution(-1, 1, -1));
    }
}

