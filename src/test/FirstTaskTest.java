package test;

import com.implemica.entity.FirstTaskReplaceVariables;
import org.junit.*;

import static org.junit.Assert.*;

public class FirstTaskTest {

    FirstTaskReplaceVariables firstTaskTest1;

    FirstTaskReplaceVariables firstTaskTest2;

    @Before
    public void setUp() throws Exception {
        firstTaskTest1 = new FirstTaskReplaceVariables(5,7);
        firstTaskTest2 = new FirstTaskReplaceVariables(-5,-7);
    }

    @Test
    public void solutionTest() throws Exception {
        firstTaskTest1.solution();
        assertEquals(7,firstTaskTest1.getFirst());
        assertEquals(5,firstTaskTest1.getSecond());
        firstTaskTest2.solution();
        assertEquals(-7,firstTaskTest2.getFirst());
        assertEquals(-5,firstTaskTest2.getSecond());

    }
}
