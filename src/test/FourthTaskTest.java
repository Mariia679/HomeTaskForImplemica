package test;

import com.implemica.entity.FourthTaskFibonacciNumber;
import org.junit.*;

import java.math.BigInteger;

import static org.junit.Assert.*;

public class FourthTaskTest {

    FourthTaskFibonacciNumber fourthTask1;

    FourthTaskFibonacciNumber fourthTask2;

    FourthTaskFibonacciNumber fourthTask3;

    @Before
    public void setUp() throws Exception {
        fourthTask1 = new FourthTaskFibonacciNumber(1);
        fourthTask2 = new FourthTaskFibonacciNumber(5);
        fourthTask3 = new FourthTaskFibonacciNumber(-2);
    }

    @After
    public void tearDown() throws Exception {
        fourthTask1 = null;
        fourthTask2 = null;
        fourthTask3 = null;
    }

    @Test
    public void solutionTest1() throws Exception {
        fourthTask1.solution();
        assertEquals(BigInteger.ONE, fourthTask1.fibonacci(1));
    }

    @Test
    public void solutionTest2() throws Exception {
        fourthTask2.solution();
        assertEquals(BigInteger.valueOf(5), fourthTask2.fibonacci(5));
    }

    @Test
    public void solutionTest3() throws Exception {
        fourthTask3.solution();
    }
}
