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
        methodTest(Integer.MIN_VALUE, Integer.MAX_VALUE, "X = " + Integer.MAX_VALUE + " ,Y = " + Integer.MIN_VALUE);
        methodTest(Integer.MIN_VALUE, Integer.MIN_VALUE, "X = " + Integer.MIN_VALUE + " ,Y = " + Integer.MIN_VALUE);
        methodTest(Integer.MAX_VALUE, Integer.MAX_VALUE, "X = " + Integer.MAX_VALUE + " ,Y = " + Integer.MAX_VALUE);
        methodTest(-1023242324, -1023242324, "X = " + -1023242324 + " ,Y = " + -1023242324);
        methodTest(1023242324, 1023242324, "X = " + 1023242324 + " ,Y = " + 1023242324);
        methodTest(0, 0, "X = " + 0 + " ,Y = " + 0);
        methodTest(0, 1, "X = " + 1 + " ,Y = " + 0);
        methodTest(0, 500000, "X = " + 500000 + " ,Y = " + 0);
        methodTest(0, 500000, "X = " + 500000 + " ,Y = " + 0);
        methodTest(1, 1, "X = " + 1 + " ,Y = " + 1);
        methodTest(5, 7, "X = " + 7 + " ,Y = " + 5);
        methodTest(10, 20, "X = " + 20 + " ,Y = " + 10);
        methodTest(20, 10, "X = " + 10 + " ,Y = " + 20);
        methodTest(30019, 30020, "X = " + 30020 + " ,Y = " + 30019);
        methodTest(30019, 12345678, "X = " + 12345678 + " ,Y = " + 30019);
        methodTest(40, -15, "X = " + -15 + " ,Y = " + 40);
        methodTest(-20, -40, "X = " + -40 + " ,Y = " + -20);
        methodTest(-9999, 1001, "X = " + 1001 + " ,Y = " + -9999);
        methodTest(-7264, -9823, "X = " + -9823 + " ,Y = " + -7264);
        methodTest(-7264, -9823, "X = " + -9823 + " ,Y = " + -7264);
    }

    private void methodTest(int first, int second, String expected) {
        firstTaskTest1.solution(first, second);
        assertTrue(output.toString().contains(expected));
    }

}
