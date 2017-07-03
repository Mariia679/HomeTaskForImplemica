package test;

import com.implemica.entity.FirstTaskReplaceVariables;
import org.junit.*;

import static org.junit.Assert.*;

public class FirstTaskTest {

    FirstTaskReplaceVariables firstTaskTest1;

    @Before
    public void setUp() throws Exception {
        firstTaskTest1 = new FirstTaskReplaceVariables(5, 7);
    }

    @After
    public void tearDown() throws Exception {
        firstTaskTest1 = null;
    }

    @Test
    public void solutionTest() throws Exception {
        firstTaskTest1.solution();
        assertEquals(7, firstTaskTest1.getFirst());
        assertEquals(5, firstTaskTest1.getSecond());
    }
}
