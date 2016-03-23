import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

/**
 * User: Oleg_Kariakin
 * Date: 3/23/16
 */
public class FactorialTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    //tests for factorial loop
    @Test
    public void testFactorialLoopException() throws Exception {
        thrown.expect(IllegalArgumentException.class);
        Factorial.factorialLoop(-1);
    }

    @Test
    public void testFactorialLoopOverflow() throws Exception {
        thrown.expect(IllegalStateException.class);
        Factorial.factorialLoop(20);
    }

    @Test
    public void testFactorialLoopOne() throws Exception {
        assertEquals(1L, Factorial.factorialLoop(1));
    }

    @Test
    public void testFactorialLoopZero() throws Exception {
        assertEquals(1L, Factorial.factorialLoop(0));
    }

    @Test
    public void testFactorialLoop() throws Exception {
        assertEquals(2L, Factorial.factorialLoop(2));
        assertEquals(6L, Factorial.factorialLoop(3));
        assertEquals(24L, Factorial.factorialLoop(4));
        assertEquals(120L, Factorial.factorialLoop(5));
        assertEquals(121645100408832000L, Factorial.factorialLoop(19));
    }

    //tests for factorial recursion
    @Test
    public void testFactorialRecursionException() throws Exception {
        thrown.expect(IllegalArgumentException.class);
        Factorial.factorialRecursion(-1);
    }

    @Test
    public void testFactorialRecursionOne() throws Exception {
        assertEquals(1L, Factorial.factorialRecursion(1));
    }

    @Test
    public void testFactorialRecursionZero() throws Exception {
        assertEquals(1L, Factorial.factorialRecursion(0));
    }

    @Test
    public void testFactorialRecursion() throws Exception {
        assertEquals(2L, Factorial.factorialRecursion(2));
        assertEquals(6L, Factorial.factorialRecursion(3));
        assertEquals(24L, Factorial.factorialRecursion(4));
        assertEquals(120L, Factorial.factorialRecursion(5));
        assertEquals(121645100408832000L, Factorial.factorialRecursion(19));
    }

}
