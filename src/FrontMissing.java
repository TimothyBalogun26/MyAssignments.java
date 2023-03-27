/**
 * @class: FrontMissing
 * @authour: Timothy Balogun
 * @course: ITEC 2140-04, Spring 2023
 * @written: March 25, 2023
 * @description: This method uses substring to take the string and cuts from the original string and prompts the last part of the string.
 */

public class FrontMissing {
    public static String missingFront(String str) {
        // sequence to help start subtring at the third digit
        return str.substring(3);
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(missingFront("Hello")); // "lo"
        System.out.println(missingFront("Java")); // "a"
        System.out.println(missingFront("Coding")); // "ing"
        System.out.println(missingFront("12345")); // "45"

    }
}
