package test;

import com.implemica.task.FindGreatestCommonDivisor;
import org.junit.*;

import static org.junit.Assert.*;

public class FindGreatestCommonDivisorTest {

    FindGreatestCommonDivisor task;

    @Before
    public void setUp() throws Exception {
        task = new FindGreatestCommonDivisor();
    }

    @Test
    public void solutionTest1() throws Exception {
        //check that if all four numbers are zero the result will be one
        methodTest(0, 0, 0, 0, 1);
        //check that if all four numbers are equal the result should be the same as this four numbers
        methodTest(173762837, 173762837, 173762837, 173762837, 173762837);

        //the special cases like all numbers are primes,all numbers dived by two,by three and consecutive numbers
        methodTest(2, 4, 6, 8, 2);
        methodTest(3, 6, 9, 12, 3);
        methodTest(23, 89, 131, 2, 1);
        methodTest(321, 322, 333, 334, 1);

        //check that if one number is zero the result should be one
        methodTest(0, 2, 3, 4, 1);
        methodTest(1, 0, 2, 3, 1);
        methodTest(1, 2, 0, 3, 1);
        methodTest(1, 2, 3, 0, 1);

        //check if three numbers divide by same divider and four do not divide this divider
        methodTest(2, 4, 6, 43, 1);
        methodTest(2, 4, 55, 22, 1);
        methodTest(2, 99, 6, 22, 1);
        methodTest(109, 4, 6, 22, 1);

        //check if two numbers divide by same divider and other two numbers divide by other same divider
        methodTest(2, 4, 9, 21, 1);
        methodTest(9, 21, 2, 4, 1);
        methodTest(9, 2, 4, 21, 1);
        methodTest(2, 9, 21, 4, 1);

        //Min value of integer illegal argument
        methodTestIllegalArgument(Integer.MIN_VALUE, 6, 12, 21);
        methodTestIllegalArgument(6, Integer.MIN_VALUE, 12, 21);
        methodTestIllegalArgument(6, 12, Integer.MIN_VALUE, 21);
        methodTestIllegalArgument(6, 12, 21, Integer.MIN_VALUE);
        methodTestIllegalArgument(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE);

        //Max value of integer
        methodTest(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
        methodTest(Integer.MAX_VALUE, 6, 12, 20, 1);
        methodTest(6, Integer.MAX_VALUE, 12, 20, 1);
        methodTest(6, 12, Integer.MAX_VALUE, 20, 1);
        methodTest(6, 12, 20, Integer.MAX_VALUE, 1);

        //middle min and max value of integer
        methodTest(-1023242324, 1023242324, 1023242324, 1023242324, 1023242324);
        methodTest(1023242324, -1023242324, 1023242324, 1023242324, 1023242324);
        methodTest(1023242324, 1023242324, -1023242324, 1023242324, 1023242324);
        methodTest(1023242324, 1023242324, 1023242324, -1023242324, 1023242324);
        methodTest(-1023242324, -1023242324, -1023242324, -1023242324, 1023242324);
        methodTest(1023242324, 1023242324, 1023242324, 1023242324, 1023242324);
    }

    private void methodTest(int one, int two, int three, int four, int expected) {
        assertEquals(expected, task.getGreatestDivisor(one, two, three, four));
    }

    private void methodTestIllegalArgument(int one, int two, int three, int four) {
//        assertThatThrownBy(() -> task.getGreatestDivisor(one, two, three,four))
//                .isInstanceOf(IllegalArgumentException.class);
        try {
            task.getGreatestDivisor(one, two, three,four);
            Assert.fail("Should throw an exception if one or more of given numbers are illegal");
        } catch (IllegalArgumentException ex) {
            //Should throw an exception if one or more of given numbers are illegal
        }
//        assertThatThrownBy(new ThrowableAssert.ThrowingCallable() {
//            @Override
//            public void call() throws Throwable {
//                task.getGreatestDivisor(one, two, three, four);
//            }
//        }).isInstanceOf(IllegalArgumentException.class);
    }

}
