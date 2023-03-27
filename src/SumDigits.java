/**
 * @class: SumDigits
 * @authour: Timothy Balogun
 * @course: ITEC 2140-04, Spring 2023
 * @written: March 25, 2023
 * @description: This program adds up and gives the sum of digits
 */

public class SumDigits {
    public static int sumDigits(int n) {
        //boolean sequence to help decide whether to print
        if (n == 0) {
            return 0;
        } else {
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            return sum;
        }
    }


    public static void main(String[] args) {
        // test cases
        System.out.println(sumDigits(123)); // 6
        System.out.println(sumDigits(0)); // 0
        System.out.println(sumDigits(999)); // 27
        System.out.println(sumDigits(-123)); // 6
    }
}
