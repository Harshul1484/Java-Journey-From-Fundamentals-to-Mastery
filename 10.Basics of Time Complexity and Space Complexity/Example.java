public class Example {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};

        // Example of an algorithm with O(n) time complexity
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        System.out.println("Sum: " + sum);

        // Example of an algorithm with O(1) space complexity
        int a = 5;
        int b = 10;
        int result = a + b;
        System.out.println("Result: " + result);
    }
}
