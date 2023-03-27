/**
 * @class: TwoPower
 * @authour: Timothy Balogun
 * @course: ITEC 2140-04, Spring 2023
 * @written: March 25, 2023
 * @description: This method uses the if boolean evaluation to determine of the number can use the power of two.
 */

public class TwoPower {
    public static void main(String[] args) {
        // Test cases for powerOfTwo method
        System.out.println(powerOfTwo(0)); // false
        System.out.println(powerOfTwo(1)); // true
        System.out.println(powerOfTwo(2)); // true
    }

    public static boolean powerOfTwo(int n) {
        if (n == 0) {
            return false;
        } else {
            do {
                if (n == 1) {
                    return true;
                } else if (n % 2 != 0) {
                    return false;
                }
                n /= 2;
            } while (true);
        }
    }
}
