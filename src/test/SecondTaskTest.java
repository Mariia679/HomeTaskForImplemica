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

    @Test
    public void solutionTest() throws Exception {
        secondTask1.solution();
        assertEquals(1, secondTask1.getFloorApartment());
        assertEquals(2, secondTask1.getPorch());
        secondTask2.solution();
        assertEquals(0, secondTask2.getPorch());
        assertEquals(0, secondTask2.getFloorApartment());
    }
}
