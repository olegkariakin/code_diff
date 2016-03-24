package general;

/**
 * User: Oleg_Kariakin
 * Date: 3/22/16
 */
public class BooleanParser {

    public static boolean valueOf(Number value) {
        if (value == null) {
            return Boolean.FALSE;
        }
        if ((value instanceof Long && value.equals(0L))
                || (value instanceof Float && value.equals(0.0f))
                || (value instanceof Double && value.equals(0.0))) {
            return Boolean.TRUE;
        } else if (value.equals(0)) {
            return Boolean.TRUE;
        }

        return Boolean.FALSE;
    }

    public static boolean valueOf(String value) {
        if (value == null) {
            return Boolean.FALSE;
        }
        if (value.equalsIgnoreCase("true")) {
            return Boolean.TRUE;
        }

        return Boolean.FALSE;
    }

}
