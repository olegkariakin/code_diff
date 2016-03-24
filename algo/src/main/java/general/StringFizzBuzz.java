package general;

import java.util.StringTokenizer;

/**
 * User: Oleg_Kariakin
 * Date: 3/23/16
 */
public class StringFizzBuzz {

    public static String fizzBuzz(String initial, String third, String fifth, String fifteents) {
        StringTokenizer tokenizer = new StringTokenizer(initial, " ,;:/?");
        StringBuffer result = new StringBuffer();

        int wordCounter = 0;
        while (tokenizer.hasMoreTokens()) {
            wordCounter++;
            String word = tokenizer.nextToken();

            if (wordCounter % 15 == 0) {
                result.append(" ").append(fifteents);
            } else if (wordCounter % 5 == 0) {
                result.append(" ").append(fifth);
            } else if (wordCounter % 3 == 0) {
                result.append(" ").append(third);
            } else {
                result.append(" ").append(word);
            }
        }
        return result.toString();
    }

}
