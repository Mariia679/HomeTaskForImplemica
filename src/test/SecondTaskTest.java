package test;

import com.implemica.entity.SecondTaskFindFloorAndPorch;
import org.junit.*;

import static org.junit.Assert.*;

public class SecondTaskTest {

    SecondTaskFindFloorAndPorch secondTask1;

    SecondTaskFindFloorAndPorch secondTask2;

    @Before
    public void setUp() throws Exception {
        secondTask1 = new SecondTaskFindFloorAndPorch(9, 4, 37);
        secondTask2 = new SecondTaskFindFloorAndPorch(-9, 4, 37);
    }

    @After
    public void tearDown() throws Exception {
        secondTask1 = null;
        secondTask2 = null;
    }

    @Test
    public void solutionTest() throws Exception {
        secondTask1.solution();
        assertEquals(1, secondTask1.getFloorApartment());
        assertEquals(2, secondTask1.getPorch());
    }

    @Test
    public void solutionNegativeTest() throws Exception {
        secondTask2.solution();
    }
}

