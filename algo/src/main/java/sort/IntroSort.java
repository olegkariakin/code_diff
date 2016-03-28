package sort;

/**
 * User: Oleg_Kariakin
 * Date: 3/28/16
 * <p/>
 * This is a quick sort that switches to a heap sort after a certain recursion depth to get
 * around quick sort's O(N^2) worst case. It's almost always better than a plain old quick sort, since you get
 * the average case of a quick sort, with guaranteed O(N log N) performance. Probably the only reason
 * to use a heap sort instead of this is in severely memory constrained systems where O(log N)
 * stack space is practically significant.
 */
public class IntroSort implements Sort {

    @Override
    public int[] sort(int[] arrayToSort, boolean ascending) throws IllegalArgumentException {
        return new int[0];  //To change body of implemented methods use File | Settings | File Templates.
    }
}
