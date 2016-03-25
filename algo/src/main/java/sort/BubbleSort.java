package sort;

/**
 * User: Oleg_Kariakin
 * Date: 3/24/16
 */
//TODO - create an interface for sort for further implementations
//TODO - create generic implementation to extend int[] to other Number values
//TODO - create factory for different implementations of sorting
public class BubbleSort {

    /**
     * Bubble sort - have n^2, shouldn't be used
     *
     * @param arrayToSort - array to be sorted
     * @param ascending   - true, false - descending
     * @throws IllegalArgumentException
     */
    public static int[] sort(int[] arrayToSort, boolean ascending) throws IllegalArgumentException {
        if (arrayToSort == null || arrayToSort.length == 0) {
            throw new IllegalArgumentException();
        }
        for (int i = 0; i < arrayToSort.length; i++) {
            for (int j = 0; j < arrayToSort.length - i - 1; j++) {
                if (ascending) { //ascending
                    if (arrayToSort[j] > arrayToSort[j + 1]) {
                        swap(arrayToSort, j, j + 1);
                    }
                } else { //descending
                    if (arrayToSort[j] < arrayToSort[j + 1]) {
                        swap(arrayToSort, j, j + 1);
                    }
                }
            }
        }

        //sorted already
        return arrayToSort;
    }

    private static void swap(int[] array, int first, int second) {
        int buf = array[first];
        array[first] = array[second];
        array[second] = buf;
    }

}
