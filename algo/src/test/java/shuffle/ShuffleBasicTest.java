package shuffle;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import sort.SortUtil;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * User: Oleg_Kariakin
 * Date: 3/24/16
 */
public class ShuffleBasicTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testShuffleNull() throws Exception {
        thrown.expect(IllegalArgumentException.class);
        ShuffleBasic.shuffle(null);
    }

    @Test
    public void testShuffleEmpty() throws Exception {
        thrown.expect(IllegalArgumentException.class);
        ShuffleBasic.shuffle(new int[]{});
    }

    @Test
    public void testShuffle() throws Exception {
        //given
        int[] initial = new int[]{-3,-3,-3, -2,-2,-2, -1, 0, 0, 1, 1, 1, 2, 3, 4, 4, 4, 4, 4};

        //when
        int[] result = ShuffleBasic.shuffle(initial);

        //expect
        assertTrue(SortUtil.isShuffled(result));
        assertTrue(SortUtil.areEqualsIgnoreOrder(initial, result));
        assertFalse(SortUtil.isAscending(result));
        assertFalse(SortUtil.isDescending(result));
    }

}
