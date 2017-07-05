package test;

import com.implemica.entity.FirstTaskReplaceVariables;
import org.junit.*;

import java.io.ByteArrayOutputStream;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FirstTaskTest extends OutputTest {

    FirstTaskReplaceVariables firstTaskTest1;

    @Before
    public void setUp() throws Exception {
        firstTaskTest1 = new FirstTaskReplaceVariables();
    }

    @After
    public void tearDown() throws Exception {
        firstTaskTest1 = null;
    }

    @Test
    public void solutionTest() throws Exception {
        firstTaskTest1.solution(5, 7);
        assertTrue(output.toString().contains("X = " + 7 + " ,Y = " + 5));

    }

    @Test
    public void solutionTest1() throws Exception {
        firstTaskTest1.solution(Integer.MIN_VALUE, Integer.MAX_VALUE);
        assertTrue(output.toString().contains("X = " + Integer.MAX_VALUE + " ,Y = " + Integer.MIN_VALUE));
    }

    @Test
    public void solutionTest3() throws Exception {
        firstTaskTest1.solution(0, 0);
        assertTrue(output.toString().contains("X = " + 0 + " ,Y = " + 0));
    }

    @Test
    public void solutionTest4() throws Exception {
        firstTaskTest1.solution(-1023242324, -1023242324);
        assertEquals("X = " + -1023242324 + " ,Y = " + -1023242324, output.toString());
    }

    @Test
    public void solutionTest5() throws Exception {
        firstTaskTest1.solution(1023242324, 1023242324);
        assertEquals("X = " + 1023242324 + " ,Y = " + 1023242324, output.toString());
    }

    @Test
    public void solutionTest6() throws Exception {
        firstTaskTest1.solution(1023242324, 1023242324);
        assertEquals("X = " + 1023242324 + " ,Y = " + 1023242324, output.toString());
    }

    @Test
    public void solutionTest7() throws Exception {
        firstTaskTest1.solution(10, 20);
        assertEquals("X = " + 20 + " ,Y = " + 10, output.toString());
    }

    @Test
    public void solutionTest8() throws Exception {
        firstTaskTest1.solution(20, 10);
        assertEquals("X = " + 10 + " ,Y = " + 20, output.toString());
    }

    @Test
    public void solutionTest9() throws Exception {
        firstTaskTest1.solution(0, 1);
        assertEquals("X = " + 1 + " ,Y = " + 0, output.toString());
    }

//    @Test
//    public void solutionTest10() throws Exception {
//        assertEquals(40 + " " + -15, firstTaskTest1.solution(-15, 40));
//    }
//
//    @Test
//    public void solutionTest11() throws Exception {
//        assertEquals(-20 + " " + 40, firstTaskTest1.solution(40, -20));
//    }
//
//    @Test
//    public void solutionTest12() throws Exception {
//        assertEquals(-9999 + " " + 1001, firstTaskTest1.solution(1001, -9999));
//    }
//
//    @Test
//    public void solutionTest13() throws Exception {
//        assertEquals(30019 + " " + 30020, firstTaskTest1.solution(30020, 30019));
//    }
//
//    @Test
//    public void solutionTest14() throws Exception {
//        assertEquals(0 + " " + 500000, firstTaskTest1.solution(500000, 0));
//    }
//
//    @Test
//    public void solutionTest15() throws Exception {
//        assertEquals(Integer.MIN_VALUE + " " + Integer.MIN_VALUE, firstTaskTest1.solution(Integer.MIN_VALUE, Integer.MIN_VALUE));
//    }
//
//    @Test
//    public void solutionTest16() throws Exception {
//        assertEquals(Integer.MAX_VALUE + " " + Integer.MAX_VALUE, firstTaskTest1.solution(Integer.MAX_VALUE, Integer.MAX_VALUE));
//    }
//
//    @Test
//    public void solutionTest17() throws Exception {
//        assertEquals(1 + " " + 1, firstTaskTest1.solution(1, 1));
//    }
//
//    @Test
//    public void solutionTest18() throws Exception {
//        assertEquals(-7264 + " " + -9823, firstTaskTest1.solution(-9823, -7264));
//    }
//
//    @Test
//    public void solutionTest19() throws Exception {
//        assertEquals(30019 + " " + 12345678, firstTaskTest1.solution(12345678, 30019));
//    }
//
//    @Test
//    public void solutionTest20() throws Exception {
//        assertEquals(01234 + " " + 07234, firstTaskTest1.solution(07234, 01234));
//    }
//
//    @Test
//    public void solutionTest21() throws Exception {
//        assertEquals(-7264 + " " + 0x5678, firstTaskTest1.solution(0x5678, -7264));
//    }
//
//    @Test
//    public void solutionTest22() throws Exception {
//        assertEquals(98 + " " + 97, firstTaskTest1.solution('a', 'b'));
//    }
//
//    @Test
//    public void solutionTest23() throws Exception {
//        assertEquals(01234 + " " + 0b010101, firstTaskTest1.solution(0b010101, 01234));
//    }

}
