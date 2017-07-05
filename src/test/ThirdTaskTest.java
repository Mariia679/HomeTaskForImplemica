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
        assertEquals(2147483647, thirdTask1.solution(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE));
    }

    @Test
    public void solutionTest2() throws Exception {
        assertEquals(Integer.MIN_VALUE, thirdTask1.solution(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE));
    }

    @Test
    public void solutionTest3() throws Exception {
        assertEquals(1, thirdTask1.solution(0, 0, 0, 0));
    }

    @Test
    public void solutionTest4() throws Exception {
        assertEquals(1, thirdTask1.solution(23, 89, 131, 2));
    }

    @Test
    public void solutionTest5() throws Exception {
        assertEquals(2, thirdTask1.solution(2, 4, 6, 8));
    }

    @Test
    public void solutionTest6() throws Exception {
        assertEquals(1023242324, thirdTask1.solution(1023242324, 1023242324, 1023242324, 1023242324));
    }

    @Test
    public void solutionTest7() throws Exception {
        assertEquals(1023242324, thirdTask1.solution(-1023242324, -1023242324, -1023242324, -1023242324));
    }

    @Test
    public void solutionTest8() throws Exception {
        assertEquals(1, thirdTask1.solution(321, 322, 333, 334));
    }

    @Test
    public void solutionTest9() throws Exception {
        assertEquals(2, thirdTask1.solution(654, 400, 600, 800));
    }

    @Test
    public void solutionTest10() throws Exception {
        assertEquals(2, thirdTask1.solution(Integer.MIN_VALUE, 6, 12, 20));
    }

    @Test
    public void solutionTest11() throws Exception {
        assertEquals(2, thirdTask1.solution(Integer.MIN_VALUE, Integer.MIN_VALUE, 6, 20));
    }

    @Test
    public void solutionTest12() throws Exception {
        assertEquals(2, thirdTask1.solution(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, 6));
    }

    @Test
    public void solutionTest13() throws Exception {
        assertEquals(2, thirdTask1.solution(Integer.MIN_VALUE, 6, 12, Integer.MIN_VALUE));
    }

    @Test
    public void solutionTest14() throws Exception {
        assertEquals(2, thirdTask1.solution(Integer.MIN_VALUE, Integer.MIN_VALUE, 6, Integer.MIN_VALUE));
    }

    @Test
    public void solutionTest15() throws Exception {
        assertEquals(2, thirdTask1.solution(Integer.MIN_VALUE, 6, Integer.MIN_VALUE, Integer.MIN_VALUE));
    }

    @Test
    public void solutionTest16() throws Exception {
        assertEquals(2, thirdTask1.solution(12, 6, Integer.MIN_VALUE, Integer.MIN_VALUE));
    }

    @Test
    public void solutionTest17() throws Exception {
        assertEquals(2, thirdTask1.solution(6, Integer.MIN_VALUE, Integer.MIN_VALUE, 6));
    }

    @Test
    public void solutionTest18() throws Exception {
        assertEquals(2, thirdTask1.solution(6, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE));
    }
}
