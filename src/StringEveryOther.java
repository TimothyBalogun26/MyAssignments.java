/**
 * @class: StringEveryOther
 * @authour: Timothy Balogun
 * @course: ITEC 2140-04, Spring 2023
 * @written: March 25, 2023
 * @description: This method returns a new string consisting of every other character in the input string.
 */

public class StringEveryOther {

    public static String everyOther(String str) {
        // This sequence uses if statements to determine if it is true and if true the next sequence will begin
        String result = "";
        for (int i = 0; i < str.length(); i += 2) {
            result += str.charAt(i);
        }
        return result;
    }


    public static void main(String[] args) {
        // test case
        String input1 = "hello world";
        String expectedOutput1 = "hlowrd";
        String actualOutput1 = everyOther(input1);
        System.out.println(actualOutput1.equals(expectedOutput1));

    }
}
