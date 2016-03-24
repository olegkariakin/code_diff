package sort;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.*;

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

    //array equals ignore order tests
    @Test
    public void testAreEqualsIgnoreOrderInitialEmpty() throws Exception {
        thrown.expect(IllegalArgumentException.class);
        SortUtil.areEqualsIgnoreOrder(new int[]{}, new int[]{});
    }

    @Test
    public void testAreEqualsIgnoreOrderInitialNull() throws Exception {
        thrown.expect(IllegalArgumentException.class);
        SortUtil.areEqualsIgnoreOrder(null, new int[]{});
    }

    @Test
    public void testAreEqualsIgnoreOrderResultedEmpty() throws Exception {
        thrown.expect(IllegalArgumentException.class);
        SortUtil.areEqualsIgnoreOrder(new int[]{1,2,3}, new int[]{});
    }

    @Test
    public void testAreEqualsIgnoreOrderResultedNull() throws Exception {
        thrown.expect(IllegalArgumentException.class);
        SortUtil.areEqualsIgnoreOrder(new int[]{1,2,3}, null);
    }

    @Test
    public void testAreEqualsIgnoreOrder() throws Exception {
        //given
        int[] initial =  new int[]{5,1,3,2,3,6,9};
        int[] resulted = new int[]{1,2,3,3,5,6,9};

        //when && expect
        assertTrue(SortUtil.areEqualsIgnoreOrder(initial, resulted));
    }

    //calculate elements count tests
    @Test
    public void testCalculateElementsCount() throws Exception {
        //given
        int[] initialArray = new int[]{3, 2, 1, 3, 2, 1, 3, 0, 1000, -100, 10, 2, 3, 1};
        Map<Integer, Integer> expectedCounts = new TreeMap<Integer, Integer>();
        expectedCounts.put(-100, 1);
        expectedCounts.put(0, 1);
        expectedCounts.put(1, 3);
        expectedCounts.put(2, 3);
        expectedCounts.put(3, 4);
        expectedCounts.put(10, 1);
        expectedCounts.put(1000, 1);

        //when
        Map<Integer, Integer> resultedCounts = SortUtil.calculateElementsCount(initialArray);

        //expect
        assertEquals(expectedCounts.keySet(), resultedCounts.keySet());
        assertEquals(expectedCounts.entrySet(), resultedCounts.entrySet());
        assertEquals(expectedCounts, resultedCounts);
    }

}
