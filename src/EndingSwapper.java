/**
 * @class: EndingSwapper
 * @authour: Timothy Balogun
 * @course: ITEC 2140-04, Spring 2023
 * @written: March 25, 2023
 * @description: This method returns a new string where the first and last characters of the given string have been swapped.
 * If the string has length 0 or 1, the original string is returned.
 */

public class EndingSwapper {

    public static String swapEnds(String str) {
        // boolean evaluation sequence used to determine what is printed and returned
        if (str.length() <= 1) {
            return str;
        } else {
            char first = str.charAt(0);
            char last = str.charAt(str.length() - 1);
            String middle = str.substring(1, str.length() - 1);
            return last + middle + first;
        }
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println(swapEnds("hello")); // expected output: "oellh"
        System.out.println(swapEnds("world")); // expected output: "dlorw"
        System.out.println(swapEnds("hi")); // expected output: "ih"
        System.out.println(swapEnds("a")); // expected output: "a"
        System.out.println(swapEnds("")); // expected output: ""
    }
}
