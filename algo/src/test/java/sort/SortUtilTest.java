package sort;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * User: Oleg_Kariakin
 * Date: 3/24/16
 */
public class SortUtilTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    //shuffled tests
    @Test
    public void testIsShuffledEmpty() throws Exception {
        thrown.expect(IllegalArgumentException.class);
        SortUtil.isShuffled(new int[]{});
    }

    @Test
    public void testIsShuffledNull() throws Exception {
        thrown.expect(IllegalArgumentException.class);
        SortUtil.isShuffled(null);
    }

    @Test
    public void testIsShuffled() throws Exception {
        //given
        int[] sortedAscArray = new int[]{-3, -2, -1, 0, 1, 2, 3};
        int[] sortedDescArray = new int[]{3, 2, 1, 0, -1, -2, -3};
        int[] shuffledArray = new int[]{3, 4, -1, 10, 0, 8, 6, 3, 1, -20};

        //when && expected
        assertFalse(SortUtil.isShuffled(sortedAscArray));
        assertFalse(SortUtil.isShuffled(sortedDescArray));
        assertTrue(SortUtil.isShuffled(shuffledArray));
    }

    //ascending tests
    @Test
    public void testIsAscendingEmpty() throws Exception {
        thrown.expect(IllegalArgumentException.class);
        SortUtil.isAscending(new int[]{});
    }

    @Test
    public void testIsAscendingNull() throws Exception {
        thrown.expect(IllegalArgumentException.class);
        SortUtil.isAscending(null);
    }

    @Test
    public void testIsAscending() throws Exception {
        //given
        int[] sortedAscArray = new int[]{-3, -2, -1, 0, 1, 2, 3};
        int[] sortDescArray = new int[]{3, 2, 1, 0, -1, -2, -3};
        int[] shuffledArray = new int[]{5, 4, -1, 2, 3, 0, 100, -20, 9, 6, -2};

        //when && expect
        assertTrue(SortUtil.isAscending(sortedAscArray));
        assertFalse(SortUtil.isAscending(sortDescArray));
        assertFalse(SortUtil.isAscending(shuffledArray));
    }

    //descending tests
    @Test
    public void testIsDescendingEmpty() throws Exception {
        thrown.expect(IllegalArgumentException.class);
        SortUtil.isDescending(new int[]{});
    }

    @Test
    public void testIsDescendingNull() throws Exception {
        thrown.expect(IllegalArgumentException.class);
        SortUtil.isDescending(null);
    }

    @Test
    public void testIsDescending() throws Exception {
        //given
        int[] sortedAscArray = new int[]{-3, -2, -1, 0, 1, 2, 3};
        int[] sortedDescArray = new int[]{3, 2, 1, 0, -1, -2, -3};
        int[] shuffledArray = new int[]{3, 5, -1, 100, 6, 8, 9, 11, 2, 3, 4, 5, -2};

        //when && expect
        assertTrue(SortUtil.isDescending(sortedDescArray));
        assertFalse(SortUtil.isDescending(sortedAscArray));
        assertFalse(SortUtil.isDescending(shuffledArray));
    }

}
