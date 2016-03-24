package general;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * User: Oleg_Kariakin
 * Date: 3/23/16
 */
public class StringFizzBuzzTest {

    @Test
    public void testFizzBuzz() throws Exception {
        //given
        String initialString = " The string tokenizer class allows an application to break a string into tokens. The tokenization method is much simpler than the one used by the StreamTokenizer class. The StringTokenizer methods do not distinguish among identifiers, numbers, and quoted strings, nor do they recognize and skip comments.";
        String expectedString = " The string third class fifth third application to third fifth string third tokens. The fifteenth method is third simpler fifth third one used third fifth StreamTokenizer third The StringTokenizer fifteenth do not third among fifth third and quoted third fifth do third recognize and fifteenth comments.";

        //when
        String result = StringFizzBuzz.fizzBuzz(initialString, "third", "fifth", "fifteenth");

        //expected
        assertEquals(expectedString, result);
    }

}
