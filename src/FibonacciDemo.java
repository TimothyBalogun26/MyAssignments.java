public class FibonacciDemo {
    public static void main(String[] args) {
        // Test cases
        System.out.println(fibonacci(0)); // Output: 0
        System.out.println(fibonacci(1)); // Output: 1
        System.out.println(fibonacci(2)); // Output: 1
        System.out.println(fibonacci(5)); // Output: 5
        System.out.println(fibonacci(10)); // Output: 55
        }


    public static int fibonacci(int n) {
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
}
