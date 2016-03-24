package general;

/**
 * User: Oleg_Kariakin
 * Date: 3/22/16
 */
public class IntegerParser {

    public static int valueOf(String valueToParse) {
        if (valueToParse == null) {
            throw new NumberFormatException("null");
        }

        if (valueToParse.equalsIgnoreCase("null")) {
            throw new NumberFormatException("nullable String");
        }

        if (valueToParse.equalsIgnoreCase("")) {
            throw new NumberFormatException("empty String");
        }

        boolean negative = false;
        int result = 0;
        char firstDigit = valueToParse.charAt(0);
        int i = 0, len = valueToParse.length();
        int limit = -Integer.MAX_VALUE;
        int dec = 10;

        //check first digit or sign
        if (firstDigit < '0') {
            if (firstDigit == '-') {
                negative = true;
            } else if (firstDigit != '+') {
                throw new NumberFormatException("Sign is not identified: " + valueToParse + "");
            } else if (valueToParse.length() == 1) {
                throw new NumberFormatException("The string consists of sign only: " + valueToParse);
            } else {
                negative = false;
            }
        }

        boolean negativeFlag = false;
        while (i != len) {
            if (valueToParse.charAt(i) == '-' || valueToParse.charAt(i) == '+') {
                i++;
                continue;
            }
            int digit = Character.digit(valueToParse.charAt(i), dec);
            if (digit >= 0 || digit <= 9) {
                int powFor = len - i - 1;
                if (negativeFlag) {
                    negativeFlag = false;
                    powFor = len - i - 2;
                }
                result = result + digit * pow((int) dec, powFor);
            } else {
                throw new NumberFormatException("Digit is incorrect: " + valueToParse);
            }
            i++;
        }

        return negative ? -result : result;
    }

    public static int pow(int base, int value) {
        int result = 1;
        for (int i = 0; i < value; i++) {
            result = result * base;
        }
        return result;
    }

}
