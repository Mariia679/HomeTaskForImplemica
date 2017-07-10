package test;

import com.implemica.task.FindTheDayOfTheWeek;
import org.junit.*;

import static org.junit.Assert.*;


public class FindTheDayOfTheWeekTest {

    FindTheDayOfTheWeek task;

    @Before
    public void setUp() throws Exception {
        task = new FindTheDayOfTheWeek();
    }

    @Test
    public void solutionTest1() throws Exception {
        //not valid value like negative numbers
        methodTestIllegalArgument(0, 0, 1);
        methodTestIllegalArgument(0, 0, 2);
        methodTestIllegalArgument(0, -1, 2);
        methodTestIllegalArgument(0, 1, -1);
        methodTestIllegalArgument(-1, 1, 2);
        //illegal day in the month the year started on sunday
        methodTestIllegalArgument(0, 32, 1);
        methodTestIllegalArgument(0, 29, 2);
        methodTestIllegalArgument(0, 32, 3);
        methodTestIllegalArgument(0, 31, 4);
        methodTestIllegalArgument(0, 32, 5);
        methodTestIllegalArgument(0, 31, 6);
        methodTestIllegalArgument(0, 32, 7);
        methodTestIllegalArgument(0, 32, 8);
        methodTestIllegalArgument(0, 31, 9);
        methodTestIllegalArgument(0, 32, 10);
        methodTestIllegalArgument(0, 31, 11);
        methodTestIllegalArgument(0, 32, 12);
        //illegal number of month
        methodTestIllegalArgument(0, 2, 13);
        //illegal first day on the year
        methodTestIllegalArgument(8, 1, 1);

        //valid value
        //first month january is 0
        //the end of each month the year started on sunday
        methodTest(7, 31, 1, 2);
        methodTest(7, 28, 2, 2);
        methodTest(7, 31, 3, 5);
        methodTest(7, 30, 4, 0);
        methodTest(7, 31, 5, 3);
        methodTest(7, 30, 6, 5);
        methodTest(7, 31, 7, 1);
        methodTest(7, 31, 8, 4);
        methodTest(7, 30, 9, 6);
        methodTest(7, 31, 10, 2);
        methodTest(7, 30, 11, 4);
        methodTest(7, 31, 12, 0);

        // The middle of each month  the year started on sunday
        methodTest(7, 15, 1, 0);
        methodTest(7, 15, 2, 3);
        methodTest(7, 15, 3, 3);
        methodTest(7, 15, 4, 6);
        methodTest(7, 15, 5, 1);
        methodTest(7, 15, 6, 4);
        methodTest(7, 15, 7, 6);
        methodTest(7, 15, 8, 2);
        methodTest(7, 15, 9, 5);
        methodTest(7, 15, 10, 0);
        methodTest(7, 15, 11, 3);
        methodTest(7, 15, 12, 5);

        //The first day of each month if year started on sunday
        methodTest(7, 1, 1, 0);
        methodTest(7, 1, 2, 3);
        methodTest(7, 1, 3, 3);
        methodTest(7, 1, 4, 6);
        methodTest(7, 1, 5, 1);
        methodTest(7, 1, 6, 4);
        methodTest(7, 1, 7, 6);
        methodTest(7, 1, 8, 2);
        methodTest(7, 1, 9, 5);
        methodTest(7, 1, 10, 0);
        methodTest(7, 1, 11, 3);
        methodTest(7, 1, 12, 5);

        //Check the year started on monday = 1,tuesday = 2,wednesday = 3,thursday = 4,friday = 5,saturday = 6
        //When first day is different check january
        methodTest(1, 1, 1, 1);
        methodTest(2, 1, 1, 2);
        methodTest(3, 1, 1, 3);
        methodTest(4, 1, 1, 4);
        methodTest(5, 1, 1, 5);
        methodTest(6, 1, 1, 6);

        methodTest(1, 1, 3, 4);
        methodTest(2, 1, 3, 5);
        methodTest(3, 1, 3, 6);
        methodTest(4, 1, 3, 0);
        methodTest(5, 1, 3, 1);
        methodTest(6, 1, 3, 2);

        //When first day is different check april
        methodTest(1, 1, 4, 0);
        methodTest(2, 1, 4, 1);
        methodTest(3, 1, 4, 2);
        methodTest(4, 1, 4, 3);
        methodTest(5, 1, 4, 4);
        methodTest(6, 1, 4, 5);

        //When first day is different check middle of the month october
        methodTest(1, 15, 10, 1);
        methodTest(2, 15, 10, 2);
        methodTest(3, 15, 10, 3);
        methodTest(4, 15, 10, 4);
        methodTest(5, 15, 10, 5);
        methodTest(6, 15, 10, 6);

        //When first day is different check middle of the month may
        methodTest(1, 15, 5, 2);
        methodTest(2, 15, 5, 3);
        methodTest(3, 15, 5, 4);
        methodTest(4, 15, 5, 5);
        methodTest(5, 15, 5, 6);
        methodTest(6, 15, 5, 0);
    }

    private void methodTest(int firstDay, int findDay, int numberOfMonth, int expected) {
        assertEquals(expected, task.getFindDay(firstDay, findDay, numberOfMonth));
    }

    private void methodTestIllegalArgument(int firstDay, int findDay, int numberOfMonth) {
//        assertThatThrownBy(() ->  task.getFindDay(firstDay, findDay, numberOfMonth))
//                .isInstanceOf(IllegalArgumentException.class);
        try {
            task.getFindDay(firstDay, findDay, numberOfMonth);
            Assert.fail("Should throw an exception if one or more of given numbers are illegal");
        } catch (IllegalArgumentException ex) {
            //Should throw an exception if one or more of given numbers are illegal
        }
//        assertThatThrownBy(new ThrowableAssert.ThrowingCallable() {
//            @Override
//            public void call() throws Throwable {
//                task.getFindDay(firstDay, findDay, numberOfMonth);
//            }
//        }).isInstanceOf(IllegalArgumentException.class);
    }

}
