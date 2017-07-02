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

    @Test
    public void solutionTest() throws Exception {
        fourthTask1.solution();
        assertEquals(BigInteger.ONE, fourthTask1.fibonacci(1));
        fourthTask2.solution();
        assertEquals(BigInteger.valueOf(5), fourthTask2.fibonacci(5));
        fourthTask3.solution();
        assertEquals(null, fourthTask3.getCache());
    }
}
