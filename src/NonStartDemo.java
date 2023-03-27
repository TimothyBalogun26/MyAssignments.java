/**
 * @class: NonStartDemo
 * @authour: Timothy Balogun
 * @course: ITEC 2140-04, Spring 2023
 * @written: March 25, 2023
 * @description: This method, given 2 strings, returns their concatenation, except omit the first char of each. If either string length is 0, return an empty string.
 */

public class NonStartDemo {

    public static String nonStart(String a, String b) {
        // boolean evaluation used to make sure sequnce is true and if true its prompted
        if (a.length() < 2 || b.length() < 2) {
            return "";
        } else {
            return a.substring(1) + b.substring(1);
        }
    }

    public static void main(String[] args) {
        // Test case 1
        String a1 = "Hello";
        String b1 = "There";
        String expected1 = "ellohere";
        String result1 = nonStart(a1, b1);
        System.out.println("Test case 1: " + (result1.equals(expected1) ? "PASSED" : "FAILED"));

    }
}
