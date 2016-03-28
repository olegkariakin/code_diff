package sort;

/**
 * User: Oleg_Kariakin
 * Date: 3/28/16
 * <p/>
 * When you need a stable, O(N log N) sort, this is about your only option.
 * The only downsides to it are that it uses O(N) auxiliary space and has a slightly larger constant than a quick sort.
 * There are some in-place merge sorts, but AFAIK they are all either not stable or worse than O(N log N).
 * Even the O(N log N) in place sorts have so much larger a constant than the plain old merge sort that they're
 * more theoretical curiosities than useful algorithms.
 */
public class MergeSort implements Sort {

    @Override
    public int[] sort(int[] arrayToSort, boolean ascending) throws IllegalArgumentException {
        return new int[0];  //To change body of implemented methods use File | Settings | File Templates.
    }
}
