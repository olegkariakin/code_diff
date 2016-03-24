package sort;

/**
 * User: Oleg_Kariakin
 * Date: 3/24/16
 */
//TODO [OPTIONAL] rewrite to generic version
public class SortUtil {

    /**
     * Verifies if the given array is shuffled.
     *
     * @throws IllegalArgumentException in case the array is empty
     */
    public static boolean isShuffled(int[] shuffledArray) throws IllegalArgumentException {
        if (shuffledArray == null || shuffledArray.length == 0) {
            throw new IllegalArgumentException("array can't be null or empty");
        }

        boolean isAscending = isAscending(shuffledArray);
        boolean isDescending = isDescending(shuffledArray);

        //check descending
        return ! (isAscending || isDescending);
    }

    static boolean isAscending(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    static boolean isDescending(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    //TODO add method to very the start and end arrays contain the same set of elements

}
