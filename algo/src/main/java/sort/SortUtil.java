package sort;

/**
 * User: Oleg_Kariakin
 * Date: 3/24/16
 */
//TODO [OPTIONAL] rewrite to generic version
public class SortUtil {

    /**
     * Verifies if the given array is shuffled.
     * @param shuffledArray - array with size > 0 to be checked for sort order
     *
     * @throws IllegalArgumentException
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

    /**
     * Checks sort order of the array to be ascending
     * @param array - array with size > 0 to be check to be sorted in ascending order
     *
     * @throws IllegalArgumentException
     * */
    public static boolean isAscending(int[] array) throws IllegalArgumentException {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("array can't be null or empty");
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] > array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Checks sort order of the array to be descending
     * @param array - array with size > 0 to be checked to be sorted in descending order
     *
     * @throws IllegalArgumentException
     * */
    public static boolean isDescending(int[] array) {
        if (array == null || array.length == 0) {
            throw new IllegalArgumentException("array can't be null or empty");
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    //TODO add method to very the start and end arrays contain the same set of elements

}
