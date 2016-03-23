import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertEquals;

/**
 * User: Oleg_Kariakin
 * Date: 3/23/16
 */
public class FibonacciTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    //tests for fibonacci loop functions
    @Test
    public void testFibonacciLoopExceptionNegative() throws Exception {
        thrown.expect(IllegalArgumentException.class);
        Fibonacci.fibonacciLoop(-1);
    }

    @Test
    public void testFibonacciLoopExceptionZero() throws Exception {
        thrown.expect(IllegalArgumentException.class);
        Fibonacci.fibonacciLoop(0);
    }

    @Test
    public void testFibonacciLoop() throws Exception {
        assertEquals(1L, Fibonacci.fibonacciLoop(1));
        assertEquals(1L, Fibonacci.fibonacciLoop(2));
        assertEquals(2L, Fibonacci.fibonacciLoop(3));
        assertEquals(3L, Fibonacci.fibonacciLoop(4));
        assertEquals(144L, Fibonacci.fibonacciLoop(12));
        assertEquals(1548008755920L, Fibonacci.fibonacciLoop(60));
        assertEquals(6792540214324356296L, Fibonacci.fibonacciLoop(150));
    }

    //tests for fibonacci recursion
    @Test
    public void testFibonacciRecursionExceptionNegative() throws Exception {
        thrown.expect(IllegalArgumentException.class);
        Fibonacci.fibonacciRecursion(-1);
    }

    @Test
    public void testFibonacciRecursionExceptionZero() throws Exception {
        thrown.expect(IllegalArgumentException.class);
        Fibonacci.fibonacciRecursion(0);
    }

    @Test
    public void testFibonacciRecursion() throws Exception {
        assertEquals(1L, Fibonacci.fibonacciRecursion(1));
        assertEquals(1L, Fibonacci.fibonacciRecursion(2));
        assertEquals(2L, Fibonacci.fibonacciRecursion(3));
        assertEquals(3L, Fibonacci.fibonacciRecursion(4));
        assertEquals(144L, Fibonacci.fibonacciRecursion(12));
        assertEquals(102334155L, Fibonacci.fibonacciRecursion(40));
    }

    //tests for fibonacciExtreme
    @Test
    public void testFibonacciExtremeExceptionNegative() throws Exception {
        thrown.expect(IllegalArgumentException.class);
        Fibonacci.fibonacciExtreme(-1);
    }

    @Test
    public void testFibonacciExtremeExceptionZero() throws Exception {
        thrown.expect(IllegalArgumentException.class);
        Fibonacci.fibonacciExtreme(0);
    }

    @Test
    public void testFibonacciExtreme() throws Exception {
        assertEquals("1", Fibonacci.fibonacciExtreme(1).toString());
        assertEquals("1", Fibonacci.fibonacciExtreme(2).toString());
        assertEquals("2", Fibonacci.fibonacciExtreme(3).toString());
        assertEquals("3", Fibonacci.fibonacciExtreme(4).toString());
        assertEquals("144", Fibonacci.fibonacciExtreme(12).toString());
        assertEquals("102334155", Fibonacci.fibonacciExtreme(40).toString());
        assertEquals("43466557686937456435688527675040625802564660517371780402481729089536555417949051890403879840079255169295922593080322634775209689623239873322471161642996440906533187938298969649928516003704476137795166849228875", Fibonacci.fibonacciExtreme(1000).toString());
    }

}
