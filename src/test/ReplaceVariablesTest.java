package test;

import com.implemica.task.ReplaceVariables;
import org.junit.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Random;

import static org.junit.Assert.*;

public class ReplaceVariablesTest {

    ReplaceVariables task;

    @Before
    public void setUp() throws Exception {
        task = new ReplaceVariables();
    }

    @Test
    public void solutionTest() throws Exception {
        //limit valuable value
        methodTest(Integer.MIN_VALUE, Integer.MAX_VALUE);
        methodTest(Integer.MAX_VALUE, Integer.MIN_VALUE);
        methodTest(Integer.MIN_VALUE, Integer.MIN_VALUE);
        methodTest(Integer.MAX_VALUE, Integer.MAX_VALUE);

        //the middle valuable value
        methodTest(-1023242324, -1023242324);
        methodTest(1023242324, 1023242324);
        methodTest(-1023242324, 1023242324);
        methodTest(1023242324, -1023242324);

        //the positive value
        methodTest(0, 0);
        methodTest(0, 1);
        methodTest(0, 500000);
        methodTest(1, 1);
        methodTest(5, 7);
        methodTest(10, 20);
        methodTest(20, 10);
        methodTest(30019, 30020);
        methodTest(30019, 12345678);

        //the negative value
        methodTest(40, -15);
        methodTest(-20, -40);
        methodTest(-9999, 1001);
        methodTest(-7264, -9823);
        methodTest(-7264, -9823);

        Random r = new Random();
        methodTest(r.nextInt(), r.nextInt());

    }

    private void methodTest(int first, int second) {
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        task.swappingVariables(first, second);
        assertEquals("X = "+second+" ,Y = "+first, output.toString());
    }

}
