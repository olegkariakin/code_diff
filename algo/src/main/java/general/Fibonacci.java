package general;

import java.math.BigInteger;

/**
 * User: Oleg_Kariakin
 * Date: 3/23/16
 */
public class Fibonacci {

    /**
     * @throws IllegalArgumentException in case fibonacci is negative or zero
     * */
    public static long fibonacciLoop(int n) throws IllegalArgumentException {
        if (n <= 0) {
            throw new IllegalArgumentException("fibonacci can't be negative or zero");
        } else if (n == 1 || n == 2) {
            return 1L;
        } else {
            long result = 0L;
            long prePrevious = 1L;
            long previous = 1L;

            for (int i = 3; i <= n; i++) {
                result = prePrevious + previous;
                prePrevious = previous;
                previous = result;
            }

            return result;
        }
    }

    /**
     * BE ADVISED - extremely slow for amounts 40+ !!!
     * NOT RECOMMENDED TO USE
     * @throws IllegalArgumentException in case fibonacci is negative or zero
     * */
    public static long fibonacciRecursion(int n) throws IllegalArgumentException {
        if (n <= 0) {
            throw new IllegalArgumentException("fibonacci can't be negative or zero");
        } else if (n == 1 || n == 2) {
            return 1L;
        } else {
            long result = fibonacciRecursion(n - 1) + fibonacciRecursion(n - 2);
            return result;
        }
    }

    /**
     * Works fine for extremely large fibonacci values
     * @throws IllegalArgumentException in case fibonacci is negative or zero
     */
    public static BigInteger fibonacciExtreme(int n) throws IllegalArgumentException {
        if (n <= 0) {
            throw new IllegalArgumentException("fibonacci can't be negative or zero");
        } else if (n == 1 || n == 2) {
            return BigInteger.ONE;
        } else {
            BigInteger result = BigInteger.ZERO;
            BigInteger prePrevious = BigInteger.ONE;
            BigInteger previous = BigInteger.ONE;

            for (int i = 3; i <= n; i++) {
                result = prePrevious.add(previous);
                prePrevious = previous;
                previous = result;
            }

            return result;
        }
    }

}
