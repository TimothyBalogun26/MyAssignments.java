public class MyAssignments {
    public static void main(String[] args) {
        MyAssignments assignments = new MyAssignments();
        // output for ReverseDoubleChar()
        System.out.println(assignments.reverseDoubleChar("Hello World"));

        // output for SumDigits()
        System.out.println(assignments.sumDigits(123));

        // output for Birthday()
        System.out.println(assignments.birthdayName("Timothy"));

        // output for FrontMissing()
        System.out.println(assignments.missingFront("Spring"));

        // output for EndingSwapper()
        System.out.println(assignments.swapEnds("Hello"));

        //output for StringEveryOther()
        System.out.println(assignments.everyOther("Technology"));

        // output for NonStartDemo()
        System.out.println(assignments.nonStart("Hello", "World"));

        // output for FibonacciDemo()
        System.out.println(assignments.fibonacci(15));

        // output for SumOfLucky()
        System.out.println(assignments.luckySum(12,5,3));

        // output for PalindromesTester()
        System.out.println(assignments.hasPalindrome("Sandwich"));

        // output for TwoPower()
        System.out.println(assignments.powerOfTwo(2));
    }
    public String reverseDoubleChar(String word) {
        String result = "";
        // uses for loop to help generate a boolean evaluation of a char
        for (int i = word.length() - 1; i >= 0; i--) {
            result += word.charAt(i) + "" + word.charAt(i); // adds the character twice to the result string
        }
        return result;
    }
    public int sumDigits(int n) {
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
    public String birthdayName(String name) {

        return ("Happy Birthday " + name + "!");
    }
    public String missingFront(String str) {
        // sequence to help start substring at the third digit
        return str.substring(3);
    }
    public String swapEnds(String str) {
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
    public String nonStart(String a, String b) {
        // boolean evaluation used to make sure sequence is true and if true its prompted
        if (a.length() < 2 || b.length() < 2) {
            return "";
        } else {
            return a.substring(1) + b.substring(1);
        }
    }
    public String everyOther(String str) {
        // This sequence uses if statements to determine if it is true and if true the next sequence will begin
        String result = "";
        for (int i = 0; i < str.length(); i += 2) {
            result += str.charAt(i);
        }
        return result;
    }
    public int fibonacci(int n) {
        // Check for negative input
        if (n < 0) {
            throw new IllegalArgumentException("Input must be non-negative.");
        } else if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            // Calculate fibonacci sequence
            int a = 0;
            int b = 1;
            for (int i = 2; i <= n; i++) {
                int c = a + b;
                a = b;
                b = c;
            }
            return b;
        }
    }
    public int luckySum(int a, int b, int c) {
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
    public boolean hasPalindrome(String str) {
        // convert to lowercase and remove non-alphanumeric characters
        str = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        for (int i = 0; i < str.length(); i++) {
            int left = i - 1;
            int right = i + 1;
            while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
                return true;
            }
        }

        for (int i = 0; i < str.length(); i++) {
            int left = i;
            int right = i + 1;
            while (left >= 0 && right < str.length() && str.charAt(left) == str.charAt(right)) {
                return true;
            }
        }
        return false;
    }
    public boolean powerOfTwo(int n) {
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
