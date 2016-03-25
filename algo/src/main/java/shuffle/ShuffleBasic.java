package shuffle;

/**
 * User: Oleg_Kariakin
 * Date: 3/24/16
 *
 * Very basic shuffle algorithm using Math.random - that came to my mind.
 * I guess there should be a better way to shuffle an array
 */
public class ShuffleBasic {

    /**
     * Shuffles array's elements
     *
     * @param initial - array to be shuffled
     * @throws IllegalArgumentException
     */
    public static int[] shuffle(int[] initial) throws IllegalArgumentException {
        if (initial == null || initial.length == 0) {
            throw new IllegalArgumentException("The initial array is null or empty");
        }

        for (int i = 0; i < initial.length; i++) {
            int newIndex = (int) (Math.random() * initial.length - 1);
            int buf = initial[i];
            initial[i] = initial[newIndex];
            initial[newIndex] = buf;
        }

        return initial;
    }

}
