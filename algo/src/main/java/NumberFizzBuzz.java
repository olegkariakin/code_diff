/**
 * User: Oleg_Kariakin
 * Date: 3/23/16
 */
public class NumberFizzBuzz {

    public static void generateFizz() {
        int number = (int) (Math.random() * 100 + 1);
        if (number % 15 == 0) {
            System.out.println("Value: " + number + " FizzBuzz");
        } else if (number % 5 == 0) {
            System.out.println("Value: " + number + " Buzz");
        } else if (number % 3 == 0) {
            System.out.println("Value: " + number + " Fizz");
        } else {
            System.out.println("Value: " + number);
        }
    }

}
