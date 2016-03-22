import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * User: Oleg_Kariakin
 * Date: 3/22/16
 */
public class BooleanParserTest {

    @Test
    public void testValueOfNumber() throws Exception {
        assertTrue(BooleanParser.valueOf(0));
        assertTrue(BooleanParser.valueOf(0.0));
        assertTrue(BooleanParser.valueOf(0.0f));
        assertTrue(BooleanParser.valueOf(0L));

        assertFalse(BooleanParser.valueOf(-1));
        assertFalse(BooleanParser.valueOf(-1.0));
        assertFalse(BooleanParser.valueOf(-1.0f));
        assertFalse(BooleanParser.valueOf(-1L));
    }

    @Test
    public void testValueOfString() throws Exception {
        assertTrue(BooleanParser.valueOf("true"));

        assertFalse(BooleanParser.valueOf("false"));
        assertFalse(BooleanParser.valueOf("something else"));
    }

}
