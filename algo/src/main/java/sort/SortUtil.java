package sort;

import java.util.Map;
import java.util.TreeMap;

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
        //TODO create or reuse validation annotation for this
        if (shuffledArray == null || shuffledArray.length == 0) {
            throw new IllegalArgumentException("Array is null or empty");
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
            throw new IllegalArgumentException("Array is null or empty");
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
            throw new IllegalArgumentException("Array is null or empty");
        }
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] < array[i + 1]) {
                return false;
            }
        }
        return true;
    }

    /**
     * Verifies that two non-null arrays of size > 0 have the same set of elements.
     *
     * @param initial - an initial array
     * @param resulted - a sorted array
     *
     * @throws IllegalArgumentException
     * */
    //TODO create or reuse validation annotation
    public static boolean areEqualsIgnoreOrder(int[] initial, int resulted[]) throws IllegalArgumentException {
        //1. perform initial validation
        if (initial == null || initial.length == 0) {
            throw new IllegalArgumentException("Initial array is null or empty");
        }
        if (resulted == null || resulted.length == 0) {
            throw new IllegalArgumentException("Resulted array is null or empty");
        }

        //2. check sizes
        if (initial.length != resulted.length) {
            return false;
        }

        //3. calculate map for the initial
        Map<Integer, Integer> initialMap = calculateElementsCount(initial);

        //4. calculate map for the resulted
        Map<Integer, Integer> resultedMap = calculateElementsCount(resulted);

        //5. compare maps
        return (initialMap.keySet().equals(resultedMap.keySet()) &&
                initialMap.entrySet().equals(resultedMap.entrySet()) &&
                initialMap.equals(resultedMap));
    }

    /**
     * Performs array evaluation by calculating count of each array element
     * E.g. [3,3,2,2,1,1,1,0] results into a map
     * value:count
     * (3:2),(2:2),(1:3),(0:1)
     *
     * @param array - array to be evaluated, should be not null and size > 0
     */
    //TODO add NotNull and NotEmpty annotation
    static Map<Integer, Integer> calculateElementsCount(int[] array) {
        Map<Integer, Integer> evaluationMap = new TreeMap<Integer, Integer>();
        for (int i = 0; i < array.length; i++) {
            if (!evaluationMap.containsKey(array[i])) {
                evaluationMap.put(array[i], 1);
            } else {
                int value = evaluationMap.get(array[i]);
                evaluationMap.put(array[i], ++value);
            }
        }
        return evaluationMap;
    }

}
