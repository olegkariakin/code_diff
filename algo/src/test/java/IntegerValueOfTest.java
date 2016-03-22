import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static junit.framework.Assert.assertEquals;

/**
 * User: Oleg_Kariakin
 * Date: 3/22/16
 */
public class IntegerValueOfTest {

    @Rule
    public final ExpectedException thrown = ExpectedException.none();

    @Test
    public void testNull() throws Exception {
        thrown.expect(NumberFormatException.class);
        IntegerParser.valueOf(null);
    }

    @Test
    public void testNullString() throws Exception {
        thrown.expect(NumberFormatException.class);
        IntegerParser.valueOf("null");
    }

    @Test
    public void testEmptyString() throws Exception {
        thrown.expect(NumberFormatException.class);
        IntegerParser.valueOf("");
    }

    @Test
    public void testSignNegative() throws Exception {
        assertEquals(1, IntegerParser.valueOf("1"));
        assertEquals(-1, IntegerParser.valueOf("-1"));
    }

    @Test
    public void testParse() throws Exception {
        assertEquals(100500, IntegerParser.valueOf("100500"));
        assertEquals(-100500, IntegerParser.valueOf("-100500"));
        assertEquals(Integer.MAX_VALUE, IntegerParser.valueOf(String.valueOf(Integer.MAX_VALUE)));
        assertEquals(Integer.MIN_VALUE, IntegerParser.valueOf(String.valueOf(Integer.MIN_VALUE)));
    }

    //test custom pow
    @Test
    public void testPow() throws Exception {
        assertEquals(1000, IntegerParser.pow(10, 3));
    }

}
