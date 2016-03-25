package search;

import sort.SortUtil;

/**
 * User: Oleg_Kariakin
 * Date: 3/24/16
 */
public class BinarySearch {

    /**
     * Searches the array for the key.
     *
     * @param array the sortedArray
     * @param key   the key to search
     *
     * @throws IllegalArgumentException
     */
    public static boolean search(int[] array, int key) throws IllegalArgumentException {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("The array can't be null or empty");
        }
        if (SortUtil.isShuffled(array)) {
            throw new IllegalArgumentException("Binary search works only for pre-sorted arrays");
        }

        int end = array.length;
        for (int i = 0; ;) {
            int mid = (i + end) / 2;
            if (key == array[mid]) {
                return true;
            } else if (key < array[mid]) {
                end = mid + array.length % 2;
            } else {
                i = mid + array.length % 2;
            }
        }
    }

}