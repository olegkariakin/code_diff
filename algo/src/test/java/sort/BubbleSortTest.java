package sort;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * User: Oleg_Kariakin
 * Date: 3/24/16
 */
public class BubbleSortTest {

    private Sort bubble;

    @Before
    public void setUp() throws Exception {
        bubble = SortFactory.getInstance(SortFactory.SortAlgo.BUBBLE);
    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testSortNull() throws Exception {
        thrown.expect(IllegalArgumentException.class);
        bubble.sort(null, true);
    }

    @Test
    public void testSortEmpty() throws Exception {
        thrown.expect(IllegalArgumentException.class);
        bubble.sort(new int[]{}, true);
    }

    @Test
    public void testSortAscending() throws Exception {
        //given
        int[] initial = new int[]{5, 6, -2, 0, 3, 11, 49, 18, 3, 3, 3, 3, 4, -2, 0, -1, -1, 9};
        assertTrue(SortUtil.isShuffled(initial));
        assertFalse(SortUtil.isAscending(initial));
        assertFalse(SortUtil.isDescending(initial));

        //when
        int[] result = bubble.sort(initial, true);

        //expect
        assertTrue(SortUtil.isAscending(result));
        assertTrue(SortUtil.areEqualsIgnoreOrder(initial, result));
        assertFalse(SortUtil.isDescending(result));
        assertFalse(SortUtil.isShuffled(result));
    }

    @Test
    public void testSortDescending() throws Exception {
        //given
        int[] initial = new int[]{5, 6, -2, 0, 3, 11, 49, 18, 3, 3, 3, 3, 4, -2, 0, -1, -1, 9};
        assertTrue(SortUtil.isShuffled(initial));
        assertFalse(SortUtil.isAscending(initial));
        assertFalse(SortUtil.isDescending(initial));

        //when
        int[] result = bubble.sort(initial, false);

        //expect
        assertTrue(SortUtil.isDescending(result));
        assertTrue(SortUtil.areEqualsIgnoreOrder(initial, result));
        assertFalse(SortUtil.isAscending(result));
        assertFalse(SortUtil.isShuffled(result));
    }

    @After
    public void tearDown() throws Exception {
        bubble = null;
    }

}
