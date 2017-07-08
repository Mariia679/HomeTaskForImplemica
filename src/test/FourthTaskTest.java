package test;

import com.implemica.task.FifthTaskFindTheDayOfTheWeek;
import com.implemica.task.FourthTaskFibonacciNumber;
import org.junit.*;
import org.junit.rules.ExpectedException;

import java.math.BigInteger;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.junit.Assert.*;

public class FourthTaskTest {

    @Rule
    public final ExpectedException exception = ExpectedException.none();

    FourthTaskFibonacciNumber fourthTask1;

    @Before
    public void setUp() throws Exception {
        fourthTask1 = new FourthTaskFibonacciNumber();
    }

    @Test
    public void solutionTest1() throws Exception {
        //illegal value
        methodTestIllegalArgument(Integer.MIN_VALUE);
        methodTestIllegalArgument(-1);
        methodTestIllegalArgument(194801);

        //valid value
        methodTest(0, BigInteger.ZERO);
        methodTest(1, BigInteger.valueOf(1));
        methodTest(5, BigInteger.valueOf(5));
        methodTest(7, BigInteger.valueOf(13));
        methodTest(9, BigInteger.valueOf(34));
        methodTest(11, BigInteger.valueOf(89));
        methodTest(12, BigInteger.valueOf(144));
        methodTest(14, BigInteger.valueOf(377));
        methodTest(16, BigInteger.valueOf(987));
        methodTest(21, BigInteger.valueOf(10_946));
        methodTest(46, BigInteger.valueOf(1_836_311_903));
        methodTest(91, BigInteger.valueOf(4660046610375530309L));
        methodTest(92, BigInteger.valueOf(7540113804746346429L));
        methodTest(93, new BigInteger("12200160415121876738"));

        //max fibonacci number that I found
        methodTest(500, new BigInteger("139423224561697880139724382870407283950070256587697307264108962948325571622863290691557658876222521294125"));
        methodTest(1001, new BigInteger("70330367711422815821835254877183549770181269836358732742604905087154537118196933579742249494562611733487750449241765991088186363265450223647106012053374121273867339111198139373125598767690091902245245323403501"));
    }

    private void methodTest(int number, BigInteger expected) {
//        assertEquals(expected, fourthTask1.getCache().get(number));
//        assertNotNull(fourthTask1.getCache());
        assertEquals(expected, fourthTask1.solution(number));
//        System.out.println(fourthTask1.getCache());
    }

    private void methodTestIllegalArgument(int number){
//        exception.expect(IllegalArgumentException.class);
//        fourthTask1.solution(number);
        assertThatThrownBy(() -> new FourthTaskFibonacciNumber().solution(number))
                .isInstanceOf(IllegalArgumentException.class);
    }
}
