/**
 * @class: Birthday
 * @authour: Timothy Balogun
 * @course: ITEC 2140-04, Spring 2023
 * @written: March 25, 2023
 * @description: This program is given the "Happy Birthday" string and inputs the name value and adds it to the string.
 */

public class Birthday {
    // Method that takes a name as input and returns a happy birthday message
    public static String birthdayName(String name) {
        return ("Happy Birthday " + name + "!");
    }

    public static void main(String[] args) {

        // Test cases for the birthdayName method
        System.out.println(birthdayName("Tim")); // "Happy Birthday Tim!"
        System.out.println(birthdayName("Bobo")); // "Happy Birthday Bobo!"
        System.out.println(birthdayName("Timothy")); // "Happy Birthday Timothy!"
    }
}
