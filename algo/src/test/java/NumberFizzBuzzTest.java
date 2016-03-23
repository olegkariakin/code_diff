import org.junit.Test;

/**
 * User: Oleg_Kariakin
 * Date: 3/23/16
 */
public class NumberFizzBuzzTest {

    @Test
    public void testGenerateFizz() throws Exception {
        for (int i = 0; i < 100; i++) {
            NumberFizzBuzz.generateFizz();
        }
    }

}
