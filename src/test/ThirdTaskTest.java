package test;

import com.implemica.entity.ThirdTaskFindGreatestCommonDivisor;
import org.junit.*;

import static org.junit.Assert.*;

public class ThirdTaskTest {

    ThirdTaskFindGreatestCommonDivisor thirdTask1;

    @Before
    public void setUp() throws Exception {
        thirdTask1 = new ThirdTaskFindGreatestCommonDivisor();
    }

    @After
    public void tearDown() throws Exception {
        thirdTask1 = null;
    }

    @Test
    public void solutionTest1() throws Exception {
        methodTest(0, 0, 0, 0, 1);
        methodTest(2, 4, 6, 8, 2);
        methodTest(23, 89, 131, 2, 1);
        methodTest(1023242324, 1023242324, 1023242324, 1023242324, 1023242324);
        methodTest(-1023242324, -1023242324, -1023242324, -1023242324, 1023242324);
        methodTest(Integer.MIN_VALUE, 6, 12, 20, 2);
        methodTest(Integer.MIN_VALUE, Integer.MIN_VALUE, 6, 20, 2);
        methodTest(Integer.MIN_VALUE, 6, 12, Integer.MIN_VALUE, 2);
        methodTest(12, 6, Integer.MIN_VALUE, Integer.MIN_VALUE, 2);
        methodTest(6, Integer.MIN_VALUE, Integer.MIN_VALUE, 6, 2);
        methodTest(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, 6, 2);
        methodTest(Integer.MIN_VALUE, Integer.MIN_VALUE, 6, Integer.MIN_VALUE, 2);
        methodTest(Integer.MIN_VALUE, 6, Integer.MIN_VALUE, Integer.MIN_VALUE, 2);
        methodTest(6, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, 2);
        methodTest(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
        methodTest(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);
        methodTest(321, 322, 333, 334, 1);
        methodTest(654, 400, 600, 800, 2);
    }

    private void methodTest(int one, int two, int three, int four, int expected) {
        assertEquals(expected, thirdTask1.solution(one, two, three, four));
    }
}
