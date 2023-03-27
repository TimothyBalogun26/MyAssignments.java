/**
 * @class: PalindromesTester
 * @authour: Timothy Balogun
 * @course: ITEC 2140-04, Spring 2023
 * @written: March 25, 2023
 * @description: This program uses method to determine if the given string contains a palindrome.
 */

public class PalindromesTester {
    public static void main(String[] args) {
        String str1 = "race car";
        String str2 = "hello world";

        System.out.println(hasPalindrome(str1));
        System.out.println(hasPalindrome(str2));
    }

    public static boolean hasPalindrome(String str) {
        // convert to lowercase and remove non-alphanumeric characters
        str = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        // check for palindromes of odd length
        for (int i = 0; i < str.length(); i++) {
            int left = i - 1;
            int right = i + 1;
            while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
                return true;
            }
        }

        // check for palindromes of even length
        for (int i = 0; i < str.length(); i++) {
            int left = i;
            int right = i + 1;
            while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
                return true;
            }
        }

        // no palindrome found
        return false;
    }
}
