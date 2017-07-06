package test;

import com.implemica.entity.FourthTaskFibonacciNumber;
import org.junit.*;

import java.math.BigInteger;

import static org.junit.Assert.*;

public class FourthTaskTest {

    FourthTaskFibonacciNumber fourthTask1;

    @Before
    public void setUp() throws Exception {
        fourthTask1 = new FourthTaskFibonacciNumber();

    }

    @After
    public void tearDown() throws Exception {
        fourthTask1 = null;
    }

    @Test
    public void solutionTest1() throws Exception {
        assertNull(fourthTask1.solution(-2147483648));
        assertNull(fourthTask1.solution(-1));
        assertNull(fourthTask1.solution(194801));
        methodTest(0, BigInteger.ZERO);
        methodTest(1, BigInteger.valueOf(1));
        methodTest(11, BigInteger.valueOf(89));
        methodTest(5, BigInteger.valueOf(5));
        methodTest(7, BigInteger.valueOf(13));
        methodTest(9, BigInteger.valueOf(34));
        methodTest(12, BigInteger.valueOf(144));
        methodTest(14, BigInteger.valueOf(377));
        methodTest(16, BigInteger.valueOf(987));
        methodTest(21, BigInteger.valueOf(10_946));
        methodTest(46, BigInteger.valueOf(1_836_311_903));
        methodTest(91, BigInteger.valueOf(4660046610375530309L));
        methodTest(92, BigInteger.valueOf(7540113804746346429L));
        methodTest(93, new BigInteger("12200160415121876738"));
        methodTest(500, new BigInteger("139423224561697880139724382870407283950070256587697307264108962948325571622863290691557658876222521294125"));
        methodTest(1001, new BigInteger("70330367711422815821835254877183549770181269836358732742604905087154537118196933579742249494562611733487750449241765991088186363265450223647106012053374121273867339111198139373125598767690091902245245323403501"));

    }

    private void methodTest(int number, BigInteger expected) {
        assertEquals(expected, fourthTask1.solution(number));

    }


}
