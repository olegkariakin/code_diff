package sort;

/**
 * Date: 3/28/16
 * Time: 1:19 PM
 *
 * Specifies sort interface
 */
public interface Sort {
    int[] sort(int[] arrayToSort, boolean ascending) throws IllegalArgumentException;
}
