package search;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import sort.SortFactory;

import static org.junit.Assert.assertEquals;

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
    public void testSearchAscending() throws Exception {
        //given
        int[] ascArray = SortFactory.getInstance(SortFactory.SortAlgo.BUBBLE).
                sort(new int[]{8, 15, -3, 14, 6, 19, 3, 10}, true);
        int key = 3;
        int expectedKeyIndex = 1;

        //when && expect
        assertEquals(expectedKeyIndex, BinarySearch.search(ascArray, key));
    }

}
