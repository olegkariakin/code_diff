package sort;

/**
 * User: Oleg_Kariakin
 * Date: 3/28/16
 */
public class SortFactory {

    public enum SortAlgo {
        BUBBLE,
        BUCKET,
        COUNTING,
        HEAP,
        INSERTION,
        INTRO,
        MERGE,
        QUICK,
        RADIX
    }

    public static Sort getInstance(SortAlgo sortAlgo) {
        switch (sortAlgo) {
            case BUBBLE:
                return new BubbleSort();
            case BUCKET:
                return new BucketSort();
            case COUNTING:
                return new CountingSort();
            case HEAP:
                return new HeapSort();
            case INSERTION:
                return new InsertionSort();
            case INTRO:
                return new IntroSort();
            case MERGE:
                return new MergeSort();
            case QUICK:
                return new QuickSort();
            case RADIX:
                return new RadixSort();
            default:
                throw new IllegalArgumentException("Algo hasn't been implemented yet");
        }
    }

}
