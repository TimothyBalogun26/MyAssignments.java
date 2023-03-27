/**
 * @class: ReverseDoubleChar
 * @authour: Timothy Balogun
 * @course: ITEC 2140-04, Spring 2023
 * @written: March 25, 2023
 * @description: This program chars using the for loop boolean evaluation and prints after the sequence.
 */

public class ReverseDoubleChar {
    public static String reverseDoubleChar(String word) {
        String result = "";
        // uses for loop to help generate a boolean evaluation of a char
        for (int i = word.length() - 1; i >= 0; i--) {
            result += word.charAt(i) + "" + word.charAt(i); // adds the character twice to the result string
        }
        return result;
    }

    // test cases for reverseDoubleChar
    public static void main(String[] args) {
        String test1 = "hello";
        String test2 = "world";
        String test3 = "";

        System.out.println(reverseDoubleChar(test1));
        System.out.println(reverseDoubleChar(test2));
        System.out.println(reverseDoubleChar(test3));
    }
}

