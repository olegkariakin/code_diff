package search;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import sort.BubbleSort;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * User: Oleg_Kariakin
 * Date: 3/24/16
 */
public class BinarySearchTest {

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void testSearchEmpty() throws Exception {
        thrown.expect(IllegalArgumentException.class);
        BinarySearch.search(new int[]{}, 1);
    }

    @Test
    public void testSearchNull() throws Exception {
        thrown.expect(IllegalArgumentException.class);
        BinarySearch.search(null, 1);
    }

    @Test
    public void testSearchEven() throws Exception {
        //when && expect
        assertTrue(BinarySearch.search(BubbleSort.sort(new int[]{3, 45, 8, 0, 6, 8, -3}, true), 8));
        assertTrue(BinarySearch.search(BubbleSort.sort(new int[]{45}, true), 45));
        assertTrue(BinarySearch.search(BubbleSort.sort(new int[]{45}, true), -19));
    }

    @Test
    public void testSearchOdd() throws Exception {
        //when && expect
        assertTrue(BinarySearch.search(BubbleSort.sort(new int[]{3, 45, 8, 0, 6, 8, -3, 9, 18, -1}, true), 0));
        assertTrue(BinarySearch.search(BubbleSort.sort(new int[]{3, 0}, true), 3));
        assertFalse(BinarySearch.search(BubbleSort.sort(new int[]{3, 0}, true), 45));
    }

}
