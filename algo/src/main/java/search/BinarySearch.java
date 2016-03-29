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
     * @return index of the key element or -1 if not found
     * @throws IllegalArgumentException
     */
    public static int search(int[] array, int key) throws IllegalArgumentException {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("The array can't be null or empty");
        }
        if (SortUtil.isShuffled(array)) {
            throw new IllegalArgumentException("Binary search works only for pre-sorted arrays");
        }

        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int midVal = array[mid];

            if (midVal < key) {
                low = mid + 1;
            } else if (midVal > key) {
                high = mid - 1;
            } else {
                return mid;
            }
        }

        return -1;
    }

}