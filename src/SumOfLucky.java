/**
 * @class: SumOfLucky
 * @authour: Timothy Balogun
 * @course: ITEC 2140-04, Spring 2023
 * @written: March 25, 2023
 * @description: In this program this method will take numbers from the boolean evaluation and prompt the sum of the lucky numbers.
 */

public class SumOfLucky {
    public static int luckySum(int a, int b, int c) {
        // boolean evaluation used to find if sequence is true or not.
        if (a == 13) {
            return 0;
        } else if (b == 13) {
            return a;
        } else if (c == 13) {
            return a + b;
        } else {
            return a + b + c;
        }
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(luckySum(1, 2, 3)); // Expected output: 6
        System.out.println(luckySum(1, 2, 13)); // Expected output: 3
        System.out.println(luckySum(1, 13, 3)); // Expected output: 1
        System.out.println(luckySum(13, 2, 3)); // Expected output: 0
    }
}
